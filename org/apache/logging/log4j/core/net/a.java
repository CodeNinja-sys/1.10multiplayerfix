/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.jms.JMSException
 *  javax.jms.Message
 *  javax.jms.MessageProducer
 *  javax.jms.ObjectMessage
 *  javax.jms.Session
 *  javax.jms.TextMessage
 */
package org.apache.logging.log4j.core.net;

import java.io.Serializable;
import java.util.Properties;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameNotFoundException;
import org.apache.logging.log4j.core.a.b;

public abstract class a
extends b {
    public a(String string) {
        super(string);
    }

    protected static Context a(String string, String string2, String string3, String string4, String string5) {
        Properties properties = org.apache.logging.log4j.core.net.a.b(string, string2, string3, string4, string5);
        return new InitialContext(properties);
    }

    protected static Object a(Context context, String string) {
        try {
            return context.lookup(string);
        }
        catch (NameNotFoundException nameNotFoundException) {
            a.f("Could not find name [" + string + "].");
            throw nameNotFoundException;
        }
    }

    protected static Properties b(String string, String string2, String string3, String string4, String string5) {
        Properties properties = new Properties();
        if (string != null) {
            properties.put("java.naming.factory.initial", string);
            if (string2 != null) {
                properties.put("java.naming.provider.url", string2);
            } else {
                a.f("The InitialContext factory name has been provided without a ProviderURL. This is likely to cause problems");
            }
            if (string3 != null) {
                properties.put("java.naming.factory.url.pkgs", string3);
            }
            if (string4 != null) {
                properties.put("java.naming.security.principal", string4);
                if (string5 != null) {
                    properties.put("java.naming.security.credentials", string5);
                } else {
                    a.f("SecurityPrincipalName has been set without SecurityCredentials. This is likely to cause problems.");
                }
            }
            return properties;
        }
        return null;
    }

    public abstract void a(Serializable var1);

    public synchronized void a(Serializable serializable, Session session, MessageProducer messageProducer) {
        try {
            TextMessage textMessage;
            if (serializable instanceof String) {
                textMessage = session.createTextMessage();
                textMessage.setText((String)((Object)serializable));
            } else {
                textMessage = session.createObjectMessage();
                ((ObjectMessage)textMessage).setObject(serializable);
            }
            messageProducer.send((Message)textMessage);
        }
        catch (JMSException jMSException) {
            a.b("Could not publish message via JMS " + this.d());
            throw jMSException;
        }
    }
}

