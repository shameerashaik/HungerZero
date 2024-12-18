import React, { useState } from 'react';
import axios from 'axios';

const RestaurantForm = () => {
  const [formData, setFormData] = useState({
    name: '',
    address: '',
    phoneNumber: '',
    location: '',
    foodForPax: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post("http://localhost:8080/hungerzero/clientpisubmit", formData);

      console.log('Form submitted successfully:', response.data);

      setFormData({
        name: '',
        address: '',
        phoneNumber: '',
        location: '',
        foodForPax: '',
      });
    } catch (error) {
      console.error('Error submitting form:', error);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label>Restaurant Name:</label>
        <input
          type="text"
          name="name"
          value={formData.name}
          onChange={handleChange}
          required
        />
      </div>

      <div>
        <label>Address:</label>
        <input
          type="text"
          name="address"
          value={formData.address}
          onChange={handleChange}
          required
        />
      </div>

      <div>
        <label>Phone Number:</label>
        <input
          type="tel"
          name="phoneNumber"
          value={formData.phoneNumber}
          onChange={handleChange}
          required
        />
      </div>

      <div>
        <label>Food for Pax (Number of People):</label>
        <input
          type="number"
          name="foodForPax"
          value={formData.foodForPax}
          onChange={handleChange}
          required
        />
      </div>

      <div>
        <button type="submit">Submit</button>
      </div>
    </form>
  );
};

export default RestaurantForm;
