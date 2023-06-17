/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import javax.management.MBeanNotificationInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;
import javax.management.ObjectName;
import org.apache.logging.log4j.core.config.f;
import org.apache.logging.log4j.core.d.a;
import org.apache.logging.log4j.core.d.e;
import org.apache.logging.log4j.core.f.h;
import org.apache.logging.log4j.core.f.i;
import org.apache.logging.log4j.core.k;
import org.apache.logging.log4j.d.d;

public class g
extends NotificationBroadcasterSupport
implements PropertyChangeListener,
h {
    private static final int c = 4096;
    private static final int d = 65536;
    private static final int e = 2048;
    private static final d f = org.apache.logging.log4j.d.d.k();
    private final AtomicLong g = new AtomicLong();
    private final ObjectName h;
    private final k i;
    private String j;

    public g(k k2, Executor executor) {
        super(executor, org.apache.logging.log4j.core.f.g.k());
        this.i = (k)a.a(k2, "loggerContext");
        try {
            String string = org.apache.logging.log4j.core.f.i.a(k2.a());
            String string2 = String.format("org.apache.logging.log4j2:type=LoggerContext,ctx=%s", string);
            this.h = new ObjectName(string2);
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception);
        }
        k2.a(this);
    }

    private static MBeanNotificationInfo k() {
        String[] arrstring = new String[]{"com.apache.logging.log4j.core.jmx.config.reconfigured"};
        String string = Notification.class.getName();
        String string2 = "Configuration reconfigured";
        return new MBeanNotificationInfo(arrstring, string, "Configuration reconfigured");
    }

    @Override
    public String a() {
        return this.i.b().toString();
    }

    @Override
    public String b() {
        return this.i.a();
    }

    private org.apache.logging.log4j.core.config.d l() {
        return this.i.d();
    }

    @Override
    public String c() {
        if (this.i.h() != null) {
            return String.valueOf(this.i.h());
        }
        if (this.e() != null) {
            return String.valueOf(new File(this.e()).toURI());
        }
        return "";
    }

    @Override
    public void a(String string) {
        f.a("---------");
        f.a("Remote request to reconfigure using location " + string);
        URI uRI = new URI(string);
        uRI.toURL().openStream().close();
        this.i.a(uRI);
        f.a("Completed remote request to reconfigure.");
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (!"config".equals(propertyChangeEvent.getPropertyName())) {
            return;
        }
        if (this.i.d().j() != null) {
            this.j = null;
        }
        Notification notification = new Notification("com.apache.logging.log4j.core.jmx.config.reconfigured", this.j(), this.m(), this.n(), null);
        this.sendNotification(notification);
    }

    @Override
    public String d() {
        return this.b(org.apache.logging.log4j.core.d.e.a.name());
    }

    @Override
    public String b(String string) {
        if (this.j != null) {
            return this.j;
        }
        try {
            Charset charset = Charset.forName(string);
            return this.a(new URI(this.c()), charset);
        }
        catch (Exception exception) {
            StringWriter stringWriter = new StringWriter(2048);
            exception.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
    }

    @Override
    public void a(String string, String string2) {
        String string3 = this.j;
        this.j = (String)a.a(string, "configText");
        f.a("---------");
        f.a("Remote request to reconfigure from config text.");
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes(string2));
            org.apache.logging.log4j.core.config.h h2 = new org.apache.logging.log4j.core.config.h(byteArrayInputStream);
            org.apache.logging.log4j.core.config.d d2 = org.apache.logging.log4j.core.config.f.a().a(h2);
            this.i.a(d2);
            f.a("Completed remote request to reconfigure from config text.");
        }
        catch (Exception exception) {
            this.j = string3;
            String string4 = "Could not reconfigure from config text";
            f.b("Could not reconfigure from config text", (Throwable)exception);
            throw new IllegalArgumentException("Could not reconfigure from config text", exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String a(URI uRI, Charset charset) {
        String string;
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        try {
            inputStream = uRI.toURL().openStream();
            inputStreamReader = new InputStreamReader(inputStream, charset);
            StringBuilder stringBuilder = new StringBuilder(65536);
            char[] arrc = new char[4096];
            int n2 = -1;
            while ((n2 = inputStreamReader.read(arrc)) >= 0) {
                stringBuilder.append(arrc, 0, n2);
            }
            string = stringBuilder.toString();
        }
        catch (Throwable throwable) {
            org.apache.logging.log4j.core.d.h.a(inputStream);
            org.apache.logging.log4j.core.d.h.a(inputStreamReader);
            throw throwable;
        }
        org.apache.logging.log4j.core.d.h.a(inputStream);
        org.apache.logging.log4j.core.d.h.a(inputStreamReader);
        return string;
    }

    @Override
    public String e() {
        return this.l().j();
    }

    @Override
    public String f() {
        return this.l().getClass().getName();
    }

    @Override
    public String g() {
        return String.valueOf(this.l().aY_());
    }

    @Override
    public String h() {
        return this.l().m().getClass().getName();
    }

    @Override
    public Map i() {
        return this.l().c();
    }

    public ObjectName j() {
        return this.h;
    }

    private long m() {
        return this.g.getAndIncrement();
    }

    private long n() {
        return System.currentTimeMillis();
    }
}

