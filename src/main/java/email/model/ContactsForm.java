package email.model;

public class ContactsForm {
    private String fio;

    private String phone;

    private String email;

    private String message;

    public String getFio() {return fio;}

    public void setFio() {this.fio = fio;}

    public String getPhone() {return phone;}

    public void setPhone() {this.phone = phone;}

    public String getEmail() {return email;}

    public void setEmail() {this.email = email;}

    public String getMessage() {return message;}

    public void setMessage() {this.message = message;}

    @Override
    public String toString() {
        return "AppointmentForm{" +
                "fio='" + fio + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
