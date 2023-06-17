/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.jms.JMSException
 *  javax.jms.MessageProducer
 *  javax.jms.Session
 *  javax.jms.Topic
 *  javax.jms.TopicConnection
 *  javax.jms.TopicConnectionFactory
 *  javax.jms.TopicPublisher
 *  javax.jms.TopicSession
 */
package org.apache.logging.log4j.core.net;

import java.io.Serializable;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.NamingException;
import org.apache.logging.log4j.core.net.a;
import org.apache.logging.log4j.core.net.r;
import org.apache.logging.log4j.core.net.s;
import org.apache.logging.log4j.core.net.t;
import org.apache.logging.log4j.d;

public class p
extends a {
    private static final s c = new s(null);
    private t d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Context i;

    protected p(String string, Context context, String string2, String string3, String string4, String string5, t t2) {
        super(string);
        this.i = context;
        this.e = string2;
        this.f = string3;
        this.g = string4;
        this.h = string5;
        this.d = t2;
    }

    public static p a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        if (string6 == null) {
            a.b("No factory name provided for JMSTopicManager");
            return null;
        }
        if (string7 == null) {
            a.b("No topic name provided for JMSTopicManager");
            return null;
        }
        String string10 = "JMSTopic:" + string6 + '.' + string7;
        return (p)p.a(string10, c, new r(string, string2, string3, string4, string5, string6, string7, string8, string9));
    }

    @Override
    public void a(Serializable serializable) {
        if (this.d == null) {
            this.d = p.b(this.i, this.e, this.f, this.g, this.h, false);
        }
        try {
            super.a(serializable, (Session)t.a(this.d), (MessageProducer)t.b(this.d));
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
                    t.a(this.d).close();
                }
                catch (Exception exception) {
                    if (bl2) break block4;
                    a.b("Error closing session for " + this.d(), (Throwable)exception);
                }
            }
            try {
                t.c(this.d).close();
            }
            catch (Exception exception) {
                if (bl2) break block5;
                a.b("Error closing connection for " + this.d(), (Throwable)exception);
            }
        }
        this.d = null;
    }

    private static t b(Context context, String string, String string2, String string3, String string4, boolean bl2) {
        block4: {
            try {
                TopicConnectionFactory topicConnectionFactory = (TopicConnectionFactory)p.a(context, string);
                TopicConnection topicConnection = string3 != null ? topicConnectionFactory.createTopicConnection(string3, string4) : topicConnectionFactory.createTopicConnection();
                TopicSession topicSession = topicConnection.createTopicSession(false, 1);
                Topic topic = (Topic)p.a(context, string2);
                TopicPublisher topicPublisher = topicSession.createPublisher(topic);
                topicConnection.start();
                return new t(topicConnection, topicSession, topicPublisher);
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

    static /* synthetic */ t a(Context context, String string, String string2, String string3, String string4, boolean bl2) {
        return p.b(context, string, string2, string3, string4, bl2);
    }

    static /* synthetic */ d f() {
        return a;
    }

    static /* synthetic */ d g() {
        return a;
    }
}

