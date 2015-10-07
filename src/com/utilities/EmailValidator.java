package com.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rafsan.jani on 10/7/15.
 */
public class EmailValidator {
    private Pattern pattern;
    private Matcher matcher;
    private  final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static EmailValidator emailValidator = new EmailValidator();

    public static EmailValidator getInstance() {
        return emailValidator;
    }

    private EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
    public boolean validate(final String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
