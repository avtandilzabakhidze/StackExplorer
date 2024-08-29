# StackExplorer

## Description

StackExplorer is a Java application that uses Retrofit and Gson to interact with the Stack Exchange API. The application retrieves and filters user data from Stack Overflow based on specific criteria. It demonstrates how to use Retrofit for API calls and Gson for JSON serialization/deserialization.

## Project Structure

### Components

- **User Class:** Represents the user data model. It includes fields such as `userName`, `location`, `answerCount`, `questionCount`, `tags`, `profileLink`, and `avatarLink`.
- **UserAPI Interface:** Defines the Retrofit API endpoints for fetching user data from Stack Exchange. The `getUsers` method retrieves users with various query parameters.
- **UserResponse Class:** Wraps the response from the Stack Exchange API and contains a list of `User` objects.
- **UserService Class:** Handles the communication with the Stack Exchange API using Retrofit. It includes methods for fetching and filtering user data.
