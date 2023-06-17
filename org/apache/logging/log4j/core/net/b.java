/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.jms.JMSException
 *  javax.jms.Message
 *  javax.jms.MessageListener
 *  javax.jms.ObjectMessage
 */
package org.apache.logging.log4j.core.net;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.naming.Context;
import javax.naming.NameNotFoundException;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.core.a;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.d;

public abstract class b
extends a
implements MessageListener {
    protected d a = c.b(this.getClass().getName());

    public void a(Message message) {
        try {
            if (message instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage)message;
                this.a((h)objectMessage.getObject());
            } else {
                this.a.f("Received message is of type " + message.getJMSType() + ", was expecting ObjectMessage.");
            }
        }
        catch (JMSException jMSException) {
            this.a.b("Exception thrown while processing incoming message.", (Throwable)jMSException);
        }
    }

    protected Object a(Context context, String string) {
        try {
            return context.lookup(string);
        }
        catch (NameNotFoundException nameNotFoundException) {
            this.a.b("Could not find name [" + string + "].");
            throw nameNotFoundException;
        }
    }
}

