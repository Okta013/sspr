package email.model;

public class AppointmentForm {
    private String surname;

    private String firstName;

    private String secondName;

    private String phone;

    private String email;

    private String message;

    public String getSurname() {return surname;}

    public void setSurname() {this.surname = surname;}

    public String getFirstName() {return firstName;}

    public void setFirstName() {this.firstName = firstName;}

    public String getSecondName() {return secondName;}

    public void setSecondName() {this.secondName = secondName;}

    public String getPhone() {return phone;}

    public void setPhone() {this.phone = phone;}

    public String getEmail() {return email;}

    public void setEmail() {this.email = email;}

    public String getMessage() {return message;}

    public void setMessage() {this.message = message;}

    @Override
    public String toString() {
        return "AppointmentForm{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
