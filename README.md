
# TravelIndia - A Spring Boot Adventure Project

Welcome to **TravelIndia**, a Spring Boot application that provides information about adventure destinations across India. This project demonstrates the use of RESTful APIs to deliver details about various tourist attractions in different states.

---

## Project Overview

The application has the following key features:

- **About Us Section**: Information about the company and its mission.
- **Contact Us Section**: Company contact details.
- **Places Section**: A categorized list of adventure destinations in India.
- Individual endpoints for detailed information about destinations in specific states (e.g., Rajasthan, Goa, Himachal Pradesh, Kerala).

---

## Code Highlights

This project leverages Spring Boot's core annotations to simplify development:

1. **@SpringBootApplication**:

   - Marks the main class as the starting point of the Spring Boot application.
   - Combines three annotations: `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`.

2. **@RestController**:

   - Indicates that this class contains RESTful web service endpoints.
   - Combines `@Controller` and `@ResponseBody`.

3. **@RequestMapping**:

   - Maps HTTP requests to handler methods of REST controllers.
   - Specifies the base URL for the controller (e.g., `/TravelIndia`).

4. **@PostMapping**:

   - Maps HTTP POST requests to specific handler methods.
   - Used to define endpoints like `/AboutUs`, `/ContactUs`, and `/places`.

---

## REST API Endpoints

### Base URL

`http://localhost:8080/TravelIndia`

### Endpoints

#### 1. **About Us**

- **URL**: `/AboutUs`
- **Method**: POST
- **Description**: Provides an introduction to TravelIndia.
- **Response**:
  ```
  Welcome to TravelIndia. We are excited to take you on a new adventure.
  Click on the places to know more about your dream destination
  ```

#### 2. **Contact Us**

- **URL**: `/ContactUs`
- **Method**: POST
- **Description**: Displays contact details for TravelIndia.
- **Response**:
  ```
  You can contact us on the details given below.
  Phone No: +91 988xxxxx
  Email: travelindin@gmail.com
  ```

#### 3. **Places Overview**

- **URL**: `/places`
- **Method**: POST
- **Description**: Lists available destinations with a teaser about more places being added.
- **Response**:
  ```
  Here you can find your dream destinations to travel.
  Click on any of the destinations below to find more about them.
  Stay tuned as we are Adding more places soon..!
  ```

#### 4. **Destination Details by State**

- **Rajasthan**

  - **URL**: `/places/rajasthan`
  - **Method**: POST
  - **Description**: Details about adventure destinations in Rajasthan.
  - **Response**:
    ```
    Jaisalmer
    Explore the golden sand dunes and majestic forts.
    ```

- **Goa**

  - **URL**: `/places/goa`
  - **Method**: POST
  - **Description**: Information about Goa.
  - **Response**:
    ```
    Baga Beach
    Enjoy vibrant nightlife and pristine beaches.
    ```

- **Himachal Pradesh**

  - **URL**: `/places/himachal`
  - **Method**: POST
  - **Description**: Adventure in Himachal Pradesh.
  - **Response**:
    ```
    Manali
    Experience snow-capped mountains and adventure sports.
    ```

- **Kerala**

  - **URL**: `/places/kerela`
  - **Method**: POST
  - **Description**: Discover destinations in Kerala.
  - **Response**:
    ```
    Munnar
    Discover lush tea gardens and serene backwaters.
    ```

---

## How to Run the Project

1. Clone the repository to your local machine:

   ```bash
   git clone <repository_url>
   ```

2. Navigate to the project directory:

   ```bash
   cd travelindia
   ```

3. Run the application using Maven:

   ```bash
   mvn spring-boot:run
   ```

4. Access the application using Postman or any REST client:

   - Base URL: `http://localhost:8080/TravelIndia`
   - Use the endpoints listed above for testing.

---

## Future Enhancements

- Integrate with a database to dynamically manage places and states.
- Add more endpoints for different regions in India.
- Implement a frontend to improve user interaction.

---

## Conclusion

This project showcases how to build a REST API using Spring Boot for a simple adventure travel application. It highlights foundational Spring concepts and annotations. Feel free to extend and enhance the project as needed.

---


