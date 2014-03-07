package com.kovitad.services.axis.security;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.apache.ws.security.WSPasswordCallback;

public class MyPasswordCallback implements CallbackHandler {
	Logger logger = LoggerFactory.getLogger(MyPasswordCallback.class);
	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for (Callback callback : callbacks) {
			// When the server side need to authenticate the user
			WSPasswordCallback pwcb = (WSPasswordCallback) callback;
			if (pwcb.getIdentifier().equals("apache")) {
				pwcb.setPassword("password");
				return;
			} else {
				throw new UnsupportedCallbackException(callback,
						"check failed");
			}

		}
	}

}
