package com.example.affordabbility.autentication.otp;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class TwilioService {
    private static final String TWILIO_ACCOUNT_SID = "AC900f91751c1c15f9659dd1fcc42584d2";
    private static final String TWILIO_AUTH_TOKEN = "e1f31c51157e0b22701848abcbee6a60";
    private static final String TWILIO_PHONE_NUMBER = "+15075965910";

    public void sendSms(String toPhoneNumber, String message) {
        Twilio.init(TWILIO_ACCOUNT_SID, TWILIO_AUTH_TOKEN);
        Message.creator(
                new PhoneNumber(toPhoneNumber),
                new PhoneNumber(TWILIO_PHONE_NUMBER),
                message)
                .create();
    }
}
