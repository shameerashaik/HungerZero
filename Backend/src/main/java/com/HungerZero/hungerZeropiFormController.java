package com.HungerZero;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hungerzero")

public class hungerZeropiFormController {
    private clientFormData submittedData;

    @PostMapping("/clientpisubmit")
    public String handleFormSubmit(@RequestBody clientFormData formData) {
        this.submittedData = formData;
        System.out.println("Form Data Received: " + formData.toString());
        return "Form data received successfully";
    }
    
    @GetMapping("/")
    public String showSuccessPage() {
        if (submittedData != null) {
            return "Data read successfully: " + submittedData.getName() + ", " + submittedData.getAddress() + ", " + submittedData.getPhoneNumber() + ", " + submittedData.getLocation() + ", " + submittedData.getFoodForPax();
        } else {
            return "No data submitted yet!";
        }
    }

}