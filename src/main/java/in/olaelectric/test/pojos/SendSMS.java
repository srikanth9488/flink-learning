package in.olaelectric.test.pojos;

import java.io.Serializable;

public class SendSMS implements Serializable {

    private String tenant;
    private String uuid;
    private String message;
    private String recipients;

    public SendSMS(){}

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    @Override
    public String toString(){
        String str = "SendSMS::::  tenant: "+tenant+" , uuid: "+uuid+" , message: "+message+" , recipients: "+recipients;
        return str;
    }
}
