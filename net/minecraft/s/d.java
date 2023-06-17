/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import java.lang.reflect.Constructor;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.dd;
import net.minecraft.client.r;
import net.minecraft.s.n;
import org.apache.logging.log4j.c;

public class d
extends n {
    private static final org.apache.logging.log4j.d a = c.c();
    private cc b;

    public void a(cc cc2) {
        this.b = cc2;
        try {
            Class<?> class_ = Class.forName("com.c.c.a");
            Constructor<?> constructor = class_.getDeclaredConstructor(n.class);
            constructor.setAccessible(true);
            Object obj = constructor.newInstance(this);
            net.minecraft.client.r.z().a(((n)obj).o());
        }
        catch (ClassNotFoundException classNotFoundException) {
            a.b("Realms module missing");
        }
        catch (Exception exception) {
            a.b("Failed to load Realms module", (Throwable)exception);
        }
    }

    public dd b(cc cc2) {
        try {
            this.b = cc2;
            Class<?> class_ = Class.forName("com.c.c.d.a.af");
            Constructor<?> constructor = class_.getDeclaredConstructor(n.class);
            constructor.setAccessible(true);
            Object obj = constructor.newInstance(this);
            return ((n)obj).o();
        }
        catch (ClassNotFoundException classNotFoundException) {
            a.b("Realms module missing");
        }
        catch (Exception exception) {
            a.b("Failed to load Realms module", (Throwable)exception);
        }
        return null;
    }

    @Override
    public void d() {
        net.minecraft.client.r.z().a(this.b);
    }
}

