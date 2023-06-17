/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.f;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import javax.management.MBeanNotificationInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;
import javax.management.ObjectName;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.f.l;
import org.apache.logging.log4j.d.c;
import org.apache.logging.log4j.d.d;

public class k
extends NotificationBroadcasterSupport
implements l,
c {
    private final AtomicLong d = new AtomicLong();
    private final ObjectName e;
    private b f = b.d;

    public k(Executor executor) {
        super(executor, k.f());
        try {
            this.e = new ObjectName("org.apache.logging.log4j2:type=StatusLogger");
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception);
        }
        org.apache.logging.log4j.d.d.k().a(this);
    }

    private static MBeanNotificationInfo f() {
        String[] arrstring = new String[]{"com.apache.logging.log4j.core.jmx.statuslogger.data", "com.apache.logging.log4j.core.jmx.statuslogger.message"};
        String string = Notification.class.getName();
        String string2 = "StatusLogger has logged an event";
        return new MBeanNotificationInfo(arrstring, string, "StatusLogger has logged an event");
    }

    @Override
    public String[] a() {
        List list = this.b();
        String[] arrstring = new String[list.size()];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arrstring[i2] = ((org.apache.logging.log4j.d.b)list.get(i2)).f();
        }
        return arrstring;
    }

    @Override
    public List b() {
        return org.apache.logging.log4j.d.d.k().o();
    }

    @Override
    public String c() {
        return this.f.name();
    }

    @Override
    public b d() {
        return this.f;
    }

    @Override
    public void a(String string) {
        this.f = b.a(string, b.c);
    }

    @Override
    public void a(org.apache.logging.log4j.d.b b2) {
        Notification notification = new Notification("com.apache.logging.log4j.core.jmx.statuslogger.message", this.e(), this.g(), this.h(), b2.f());
        this.sendNotification(notification);
        Notification notification2 = new Notification("com.apache.logging.log4j.core.jmx.statuslogger.data", (Object)this.e(), this.g(), this.h());
        notification2.setUserData(b2);
        this.sendNotification(notification2);
    }

    public ObjectName e() {
        return this.e;
    }

    private long g() {
        return this.d.getAndIncrement();
    }

    private long h() {
        return System.currentTimeMillis();
    }
}

