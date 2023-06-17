/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.main;

import b.l;
import b.v;
import b.w;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import net.minecraft.client.main.a;
import net.minecraft.client.main.b;
import net.minecraft.client.main.c;
import net.minecraft.client.main.f;
import net.minecraft.client.main.g;
import net.minecraft.client.main.h;
import net.minecraft.client.main.i;
import net.minecraft.client.main.j;
import net.minecraft.client.r;
import net.minecraft.l.k;
import net.minecraft.u.bc;
import net.minecraft.u.bs;
import org.apache.commons.b.o;

public class Main {
    public static void main(String[] arrstring) {
        r.I = new k();
        try {
            o.f(new File("resourcepacks"));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        b.r r2 = new b.r();
        r2.b();
        r2.a("demo");
        r2.a("fullscreen");
        r2.a("checkGlErrors");
        b.c c2 = r2.a("server").f();
        b.c c3 = r2.a("port").f().a(Integer.class).a(25565, new Integer[0]);
        b.c c4 = r2.a("gameDir").f().a(File.class).a(new File("."), new File[0]);
        b.c c5 = r2.a("assetsDir").f().a(File.class);
        b.c c6 = r2.a("resourcePackDir").f().a(File.class);
        b.c c7 = r2.a("proxyHost").f();
        b.c c8 = r2.a("proxyPort").f().a("8080", new String[0]).a(Integer.class);
        b.c c9 = r2.a("proxyUser").f();
        b.c c10 = r2.a("proxyPass").f();
        b.c c11 = r2.a("username").f().a("Player" + r.I() % 1000L, new String[0]);
        b.c c12 = r2.a("uuid").f();
        b.c c13 = r2.a("accessToken").f().f();
        b.c c14 = r2.a("version").f().f();
        b.c c15 = r2.a("width").f().a(Integer.class).a(854, new Integer[0]);
        b.c c16 = r2.a("height").f().a(Integer.class).a(480, new Integer[0]);
        b.c c17 = r2.a("userProperties").f().a("{}", new String[0]);
        b.c c18 = r2.a("profileProperties").f().a("{}", new String[0]);
        b.c c19 = r2.a("assetIndex").f();
        b.c c20 = r2.a("userType").f().a("legacy", new String[0]);
        b.c c21 = r2.a("versionType").f().a("release", new String[0]);
        l l2 = r2.a();
        v v2 = r2.a(arrstring);
        List list = v2.d(l2);
        if (!list.isEmpty()) {
            System.out.println("Completely ignored arguments: " + list);
        }
        String string = (String)v2.c(c7);
        Proxy proxy = Proxy.NO_PROXY;
        if (string != null) {
            try {
                proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(string, (int)((Integer)v2.c(c8))));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        String string2 = (String)v2.c(c9);
        String string3 = (String)v2.c(c10);
        if (!proxy.equals(Proxy.NO_PROXY) && Main.a(string2) && Main.a(string3)) {
            Authenticator.setDefault(new a(string2, string3));
        }
        int n2 = (Integer)v2.c(c15);
        int n3 = (Integer)v2.c(c16);
        boolean bl2 = v2.a("fullscreen");
        boolean bl3 = v2.a("checkGlErrors");
        boolean bl4 = v2.a("demo");
        String string4 = (String)v2.c(c14);
        com.a.b.k k2 = new com.a.b.r().a((Type)((Object)com.c.a.d.b.class), (Object)new com.c.a.d.c()).i();
        com.c.a.d.b b2 = (com.c.a.d.b)bc.a(k2, (String)v2.c(c17), com.c.a.d.b.class);
        com.c.a.d.b b3 = (com.c.a.d.b)bc.a(k2, (String)v2.c(c18), com.c.a.d.b.class);
        String string5 = (String)v2.c(c21);
        File file = (File)v2.c(c4);
        File file2 = v2.a((w)c5) ? (File)v2.c(c5) : new File(file, "assets/");
        File file3 = v2.a((w)c6) ? (File)v2.c(c6) : new File(file, "resourcepacks/");
        String string6 = v2.a((w)c12) ? (String)c12.b(v2) : (String)c11.b(v2);
        String string7 = v2.a((w)c19) ? (String)c19.b(v2) : null;
        String string8 = (String)v2.c(c2);
        Integer n4 = (Integer)v2.c(c3);
        bs bs2 = new bs((String)c11.b(v2), string6, (String)c13.b(v2), (String)c20.b(v2));
        b b4 = new b(new j(bs2, b2, b3, proxy), new f(n2, n3, bl2, bl3), new i(file, file3, file2, string7), new h(bl4, string4, string5), new g(string8, n4));
        Runtime.getRuntime().addShutdownHook(new c("Client Shutdown Thread"));
        Thread.currentThread().setName("Client thread");
        new r(b4).a();
    }

    private static boolean a(String string) {
        return string != null && !string.isEmpty();
    }
}

