/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import com.a.a.d.sz;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import net.minecraft.p.a;
import net.minecraft.p.e;

public class d {
    private final Map a = sz.c();
    private final Map b = sz.c();
    private final String c = UUID.randomUUID().toString();
    private final URL d;
    private final a e;
    private final Timer f = new Timer("Snooper Timer", true);
    private final Object g = new Object();
    private final long h;
    private boolean i;
    private int j;

    public d(String string, a a2, long l2) {
        try {
            this.d = new URL("http://snoop.minecraft.net/" + string + "?version=" + 2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException();
        }
        this.e = a2;
        this.h = l2;
    }

    public void a() {
        if (!this.i) {
            this.i = true;
            this.h();
            this.f.schedule((TimerTask)new e(this), 0L, 900000L);
        }
    }

    private void h() {
        this.i();
        this.a("snooper_token", this.c);
        this.b("snooper_token", this.c);
        this.b("os_name", System.getProperty("os.name"));
        this.b("os_version", System.getProperty("os.version"));
        this.b("os_architecture", System.getProperty("os.arch"));
        this.b("java_version", System.getProperty("java.version"));
        this.a("version", "1.10 Multiplayer Fix");
        this.e.b(this);
    }

    private void i() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> list = runtimeMXBean.getInputArguments();
        int n2 = 0;
        for (String string : list) {
            if (!string.startsWith("-X")) continue;
            this.a("jvm_arg[" + n2++ + "]", string);
        }
        this.a("jvm_args", n2);
    }

    public void b() {
        this.b("memory_total", Runtime.getRuntime().totalMemory());
        this.b("memory_max", Runtime.getRuntime().maxMemory());
        this.b("memory_free", Runtime.getRuntime().freeMemory());
        this.b("cpu_cores", Runtime.getRuntime().availableProcessors());
        this.e.a(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, Object object) {
        Object object2 = this.g;
        synchronized (object2) {
            this.b.put(string, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(String string, Object object) {
        Object object2 = this.g;
        synchronized (object2) {
            this.a.put(string, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map c() {
        LinkedHashMap linkedHashMap = sz.d();
        Object object = this.g;
        synchronized (object) {
            this.b();
            for (Map.Entry entry : this.a.entrySet()) {
                linkedHashMap.put((String)entry.getKey(), entry.getValue().toString());
            }
            for (Map.Entry entry : this.b.entrySet()) {
                linkedHashMap.put((String)entry.getKey(), entry.getValue().toString());
            }
            return linkedHashMap;
        }
    }

    public boolean d() {
        return this.i;
    }

    public void e() {
        this.f.cancel();
    }

    public String f() {
        return this.c;
    }

    public long g() {
        return this.h;
    }

    static /* synthetic */ a a(d d2) {
        return d2.e;
    }

    static /* synthetic */ Object b(d d2) {
        return d2.g;
    }

    static /* synthetic */ Map c(d d2) {
        return d2.b;
    }

    static /* synthetic */ int d(d d2) {
        return d2.j;
    }

    static /* synthetic */ Map e(d d2) {
        return d2.a;
    }

    static /* synthetic */ void a(d d2, int n2) {
        d2.j = n2;
    }

    static /* synthetic */ String f(d d2) {
        return d2.c;
    }

    static /* synthetic */ URL g(d d2) {
        return d2.d;
    }
}

