# customer_service.py
from utils.email_service import send_email

def create_service_request(customer_email, admin_email, request_details):
    # Logic to save the service request in the database
    save_service_request_to_db(customer_email, request_details)

    # Send email to admin
    subject = "New Service Request from Customer"
    message = f"A new service request has been made by {customer_email}. Details: {request_details}"
    send_email(admin_email, subject, message)

def save_service_request_to_db(customer_email, request_details):
    # Implement your database saving logic here
    pass

# Example usage
admin_email = "admin@example.com"
customer_email = "customer@example.com"
request_details = "Service request details here"
create_service_request(customer_email, admin_email, request_details)
