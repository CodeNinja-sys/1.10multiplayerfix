/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.jms.JMSException
 *  javax.jms.MessageProducer
 *  javax.jms.Queue
 *  javax.jms.QueueConnection
 *  javax.jms.QueueConnectionFactory
 *  javax.jms.QueueSender
 *  javax.jms.QueueSession
 *  javax.jms.Session
 */
package org.apache.logging.log4j.core.net;

import java.io.Serializable;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.NamingException;
import org.apache.logging.log4j.core.net.a;
import org.apache.logging.log4j.core.net.m;
import org.apache.logging.log4j.core.net.n;
import org.apache.logging.log4j.core.net.o;
import org.apache.logging.log4j.d;

public class k
extends a {
    private static final n c = new n(null);
    private o d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Context i;

    protected k(String string, Context context, String string2, String string3, String string4, String string5, o o2) {
        super(string);
        this.i = context;
        this.e = string2;
        this.f = string3;
        this.g = string4;
        this.h = string5;
        this.d = o2;
    }

    public static k a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        if (string6 == null) {
            a.b("No factory name provided for JMSQueueManager");
            return null;
        }
        if (string7 == null) {
            a.b("No topic name provided for JMSQueueManager");
            return null;
        }
        String string10 = "JMSQueue:" + string6 + '.' + string7;
        return (k)k.a(string10, c, new m(string, string2, string3, string4, string5, string6, string7, string8, string9));
    }

    @Override
    public synchronized void a(Serializable serializable) {
        if (this.d == null) {
            this.d = k.b(this.i, this.e, this.f, this.g, this.h, false);
        }
        try {
            super.a(serializable, (Session)o.a(this.d), (MessageProducer)o.b(this.d));
        }
        catch (Exception exception) {
            this.a(true);
            throw exception;
        }
    }

    @Override
    public void a() {
        if (this.d != null) {
            this.a(false);
        }
    }

    private void a(boolean bl2) {
        block5: {
            block4: {
                try {
                    o.a(this.d).close();
                }
                catch (Exception exception) {
                    if (bl2) break block4;
                    a.b("Error closing session for " + this.d(), (Throwable)exception);
                }
            }
            try {
                o.c(this.d).close();
            }
            catch (Exception exception) {
                if (bl2) break block5;
                a.b("Error closing connection for " + this.d(), (Throwable)exception);
            }
        }
        this.d = null;
    }

    private static o b(Context context, String string, String string2, String string3, String string4, boolean bl2) {
        block4: {
            try {
                QueueConnectionFactory queueConnectionFactory = (QueueConnectionFactory)k.a(context, string);
                QueueConnection queueConnection = string3 != null ? queueConnectionFactory.createQueueConnection(string3, string4) : queueConnectionFactory.createQueueConnection();
                QueueSession queueSession = queueConnection.createQueueSession(false, 1);
                Queue queue = (Queue)k.a(context, string2);
                QueueSender queueSender = queueSession.createSender(queue);
                queueConnection.start();
                return new o(queueConnection, queueSession, queueSender);
            }
            catch (NamingException namingException) {
                a.f("Unable to locate connection factory " + string, (Throwable)namingException);
                if (!bl2) {
                    throw namingException;
                }
            }
            catch (JMSException jMSException) {
                a.f("Unable to create connection to queue " + string2, (Throwable)jMSException);
                if (bl2) break block4;
                throw jMSException;
            }
        }
        return null;
    }

    static /* synthetic */ o a(Context context, String string, String string2, String string3, String string4, boolean bl2) {
        return k.b(context, string, string2, string3, string4, bl2);
    }

    static /* synthetic */ d f() {
        return a;
    }

    static /* synthetic */ d g() {
        return a;
    }
}

