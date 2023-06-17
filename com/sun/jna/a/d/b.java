/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.a;
import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.c;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.dz;
import com.sun.jna.a.d.ea;
import com.sun.jna.a.d.fx;
import com.sun.jna.a.d.gc;
import com.sun.jna.a.d.gf;
import com.sun.jna.a.d.gg;
import com.sun.jna.a.d.gr;
import com.sun.jna.a.d.gt;
import com.sun.jna.a.d.gw;
import com.sun.jna.a.d.gz;
import com.sun.jna.a.d.hb;
import com.sun.jna.a.d.hg;
import com.sun.jna.a.d.hj;
import com.sun.jna.a.d.hk;
import com.sun.jna.b.e;
import com.sun.jna.b.f;
import com.sun.jna.b.h;
import com.sun.jna.bw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class b {
    public static String a() {
        char[] arrc = new char[128];
        e e2 = new e(arrc.length);
        boolean bl2 = a.g.a(arrc, e2);
        if (!bl2) {
            switch (ac.g.f()) {
                case 122: {
                    arrc = new char[e2.d()];
                    break;
                }
                default: {
                    throw new dy(Native.a());
                }
            }
            bl2 = a.g.a(arrc, e2);
        }
        if (!bl2) {
            throw new dy(Native.a());
        }
        return Native.a(arrc);
    }

    public static c a(String string) {
        return b.a(null, string);
    }

    public static c a(String string, String string2) {
        char[] arrc;
        e e2 = new e(0);
        e e3 = new e(0);
        h h2 = new h();
        if (a.g.a(string, string2, null, e2, null, e3, h2)) {
            throw new RuntimeException("LookupAccountNameW was expected to fail with ERROR_INSUFFICIENT_BUFFER");
        }
        int n2 = ac.g.f();
        if (e2.d() == 0 || n2 != 122) {
            throw new dy(n2);
        }
        com.sun.jna.ac ac2 = new com.sun.jna.ac(e2.d());
        gr gr2 = new gr(ac2);
        if (!a.g.a(string, string2, gr2, e2, arrc = new char[e3.d() + 1], e3, h2)) {
            throw new dy(ac.g.f());
        }
        c c2 = new c();
        c2.e = h2.c().e(0L);
        c2.a = string2;
        String[] arrstring = string2.split("\\\\", 2);
        String[] arrstring2 = string2.split("@", 2);
        c2.a = arrstring.length == 2 ? arrstring[1] : (arrstring2.length == 2 ? arrstring2[0] : string2);
        if (e3.d() > 0) {
            c2.b = Native.a(arrc);
            c2.f = c2.b + "\\" + c2.a;
        } else {
            c2.f = c2.a;
        }
        c2.c = gr2.s();
        c2.d = b.b(new gr(c2.c));
        return c2;
    }

    public static c a(gr gr2) {
        return b.a(null, gr2);
    }

    public static c a(String string, gr gr2) {
        e e2 = new e();
        e e3 = new e();
        h h2 = new h();
        if (a.g.a(null, gr2, null, e2, null, e3, h2)) {
            throw new RuntimeException("LookupAccountSidW was expected to fail with ERROR_INSUFFICIENT_BUFFER");
        }
        int n2 = ac.g.f();
        if (e2.d() == 0 || n2 != 122) {
            throw new dy(n2);
        }
        char[] arrc = new char[e3.d()];
        char[] arrc2 = new char[e2.d()];
        if (!a.g.a(null, gr2, arrc2, e2, arrc, e3, h2)) {
            throw new dy(ac.g.f());
        }
        c c2 = new c();
        c2.e = h2.c().e(0L);
        c2.a = Native.a(arrc2);
        if (e3.d() > 0) {
            c2.b = Native.a(arrc);
            c2.f = c2.b + "\\" + c2.a;
        } else {
            c2.f = c2.a;
        }
        c2.c = gr2.s();
        c2.d = b.b(gr2);
        return c2;
    }

    public static String b(gr gr2) {
        h h2 = new h();
        if (!a.g.a(gr2, h2)) {
            throw new dy(ac.g.f());
        }
        String string = h2.d().a(0L, true);
        ac.g.a(h2.d());
        return string;
    }

    public static byte[] b(String string) {
        gt gt2 = new gt();
        if (!a.g.a(string, gt2)) {
            throw new dy(ac.g.f());
        }
        return gt2.d().s();
    }

    public static boolean a(String string, int n2) {
        gt gt2 = new gt();
        if (!a.g.a(string, gt2)) {
            throw new dy(ac.g.f());
        }
        return a.g.a(gt2.d(), n2);
    }

    public static boolean a(byte[] arrby, int n2) {
        gr gr2 = new gr(arrby);
        return a.g.a(gr2, n2);
    }

    public static c c(String string) {
        return b.b(null, string);
    }

    public static c b(String string, String string2) {
        return b.a(string, new gr(b.b(string2)));
    }

    public static c[] a(gf gf2) {
        e e2 = new e();
        if (a.g.a(gf2, 2, null, 0, e2)) {
            throw new RuntimeException("Expected GetTokenInformation to fail with ERROR_INSUFFICIENT_BUFFER");
        }
        int n2 = ac.g.f();
        if (n2 != 122) {
            throw new dy(n2);
        }
        hb hb2 = new hb(e2.d());
        if (!a.g.a(gf2, 2, hb2, e2.d(), e2)) {
            throw new dy(ac.g.f());
        }
        ArrayList<c> arrayList = new ArrayList<c>();
        for (gz gz2 : hb2.s()) {
            c c2 = null;
            try {
                c2 = b.a(gz2.a);
            }
            catch (Exception exception) {
                c2 = new c();
                c2.c = gz2.a.s();
                c2.a = c2.d = b.b(gz2.a);
                c2.f = c2.d;
                c2.e = 2;
            }
            arrayList.add(c2);
        }
        return arrayList.toArray(new c[0]);
    }

    public static c b(gf gf2) {
        e e2 = new e();
        if (a.g.a(gf2, 1, null, 0, e2)) {
            throw new RuntimeException("Expected GetTokenInformation to fail with ERROR_INSUFFICIENT_BUFFER");
        }
        int n2 = ac.g.f();
        if (n2 != 122) {
            throw new dy(n2);
        }
        hg hg2 = new hg(e2.d());
        if (!a.g.a(gf2, 1, hg2, e2.d(), e2)) {
            throw new dy(ac.g.f());
        }
        return b.a(hg2.a.a);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static c[] b() {
        gg gg2 = new gg();
        try {
            Object object;
            gf gf2 = ac.g.c();
            if (!a.g.a(gf2, 10, true, gg2)) {
                if (1008 != ac.g.f()) {
                    throw new dy(ac.g.f());
                }
                object = ac.g.e();
                if (!a.g.a((gf)object, 10, gg2)) {
                    throw new dy(ac.g.f());
                }
            }
            object = b.a(gg2.d());
            return object;
        }
        finally {
            if (gg2.d() != dz.T_ && !ac.g.b(gg2.d())) {
                throw new dy(ac.g.f());
            }
        }
    }

    public static boolean a(hj hj2, String string) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131097, hk2);
        switch (n2) {
            case 0: {
                a.g.a(hk2.d());
                return true;
            }
            case 2: {
                return false;
            }
        }
        throw new dy(n2);
    }

    public static boolean a(hj hj2, String string, String string2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131097, hk2);
        try {
            switch (n2) {
                case 0: {
                    break;
                }
                case 2: {
                    boolean bl2 = false;
                    return bl2;
                }
                default: {
                    throw new dy(n2);
                }
            }
            e e2 = new e();
            e e3 = new e();
            n2 = a.g.a(hk2.d(), string2, 0, e3, (char[])null, e2);
            switch (n2) {
                case 0: 
                case 122: {
                    boolean bl3 = true;
                    return bl3;
                }
                case 2: {
                    boolean bl4 = false;
                    return bl4;
                }
            }
            throw new dy(n2);
        }
        finally {
            if (hk2.d() != dz.T_ && (n2 = a.g.a(hk2.d())) != 0) {
                throw new dy(n2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String b(hj hj2, String string, String string2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131097, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            e e2 = new e();
            e e3 = new e();
            n2 = a.g.a(hk2.d(), string2, 0, e3, (char[])null, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            if (e3.d() != 1 && e3.d() != 2) {
                throw new RuntimeException("Unexpected registry type " + e3.d() + ", expected REG_SZ or REG_EXPAND_SZ");
            }
            char[] arrc = new char[e2.d()];
            n2 = a.g.a(hk2.d(), string2, 0, e3, arrc, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            String string3 = Native.a(arrc);
            return string3;
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String c(hj hj2, String string, String string2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131097, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            e e2 = new e();
            e e3 = new e();
            n2 = a.g.a(hk2.d(), string2, 0, e3, (char[])null, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            if (e3.d() != 2) {
                throw new RuntimeException("Unexpected registry type " + e3.d() + ", expected REG_SZ");
            }
            char[] arrc = new char[e2.d()];
            n2 = a.g.a(hk2.d(), string2, 0, e3, arrc, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            String string3 = Native.a(arrc);
            return string3;
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String[] d(hj hj2, String string, String string2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131097, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            String[] arrstring;
            e e2 = new e();
            e e3 = new e();
            n2 = a.g.a(hk2.d(), string2, 0, e3, (char[])null, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            if (e3.d() != 7) {
                throw new RuntimeException("Unexpected registry type " + e3.d() + ", expected REG_SZ");
            }
            com.sun.jna.ac ac2 = new com.sun.jna.ac(e2.d());
            n2 = a.g.a(hk2.d(), string2, 0, e3, ac2, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            ArrayList<String[]> arrayList = new ArrayList<String[]>();
            int n3 = 0;
            while ((long)n3 < ac2.g()) {
                arrstring = ac2.a((long)n3, true);
                n3 += arrstring.length() * Native.c;
                n3 += Native.c;
                arrayList.add(arrstring);
            }
            arrstring = arrayList.toArray(new String[0]);
            return arrstring;
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] e(hj hj2, String string, String string2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131097, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            e e2 = new e();
            e e3 = new e();
            n2 = a.g.a(hk2.d(), string2, 0, e3, (char[])null, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            if (e3.d() != 3) {
                throw new RuntimeException("Unexpected registry type " + e3.d() + ", expected REG_BINARY");
            }
            byte[] arrby = new byte[e2.d()];
            n2 = a.g.a(hk2.d(), string2, 0, e3, arrby, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            byte[] arrby2 = arrby;
            return arrby2;
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int f(hj hj2, String string, String string2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131097, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            e e2 = new e();
            e e3 = new e();
            n2 = a.g.a(hk2.d(), string2, 0, e3, (char[])null, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            if (e3.d() != 4) {
                throw new RuntimeException("Unexpected registry type " + e3.d() + ", expected REG_DWORD");
            }
            e e4 = new e();
            n2 = a.g.a(hk2.d(), string2, 0, e3, e4, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            int n3 = e4.d();
            return n3;
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static long g(hj hj2, String string, String string2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131097, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            e e2 = new e();
            e e3 = new e();
            n2 = a.g.a(hk2.d(), string2, 0, e3, (char[])null, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            if (e3.d() != 11) {
                throw new RuntimeException("Unexpected registry type " + e3.d() + ", expected REG_QWORD");
            }
            f f2 = new f();
            n2 = a.g.a(hk2.d(), string2, 0, e3, f2, e2);
            if (n2 != 0 && n2 != 122) {
                throw new dy(n2);
            }
            long l2 = f2.d();
            return l2;
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static boolean b(hj hj2, String string) {
        hk hk2 = new hk();
        e e2 = new e();
        int n2 = a.g.a(hj2, string, 0, null, 0, 131097, null, hk2, e2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        n2 = a.g.a(hk2.d());
        if (n2 != 0) {
            throw new dy(n2);
        }
        return 1 == e2.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean h(hj hj2, String string, String string2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 4, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            boolean bl2 = b.b(hk2.d(), string2);
            return bl2;
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static void a(hj hj2, String string, int n2) {
        byte[] arrby = new byte[]{(byte)(n2 & 0xFF), (byte)(n2 >> 8 & 0xFF), (byte)(n2 >> 16 & 0xFF), (byte)(n2 >> 24 & 0xFF)};
        int n3 = a.g.a(hj2, string, 0, 4, arrby, 4);
        if (n3 != 0) {
            throw new dy(n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(hj hj2, String string, String string2, int n2) {
        hk hk2 = new hk();
        int n3 = a.g.a(hj2, string, 0, 131103, hk2);
        if (n3 != 0) {
            throw new dy(n3);
        }
        try {
            b.a(hk2.d(), string2, n2);
        }
        finally {
            n3 = a.g.a(hk2.d());
            if (n3 != 0) {
                throw new dy(n3);
            }
        }
    }

    public static void a(hj hj2, String string, long l2) {
        byte[] arrby = new byte[]{(byte)(l2 & 0xFFL), (byte)(l2 >> 8 & 0xFFL), (byte)(l2 >> 16 & 0xFFL), (byte)(l2 >> 24 & 0xFFL), (byte)(l2 >> 32 & 0xFFL), (byte)(l2 >> 40 & 0xFFL), (byte)(l2 >> 48 & 0xFFL), (byte)(l2 >> 56 & 0xFFL)};
        int n2 = a.g.a(hj2, string, 0, 11, arrby, 8);
        if (n2 != 0) {
            throw new dy(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(hj hj2, String string, String string2, long l2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131103, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            b.a(hk2.d(), string2, l2);
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static void i(hj hj2, String string, String string2) {
        char[] arrc = Native.c(string2);
        int n2 = a.g.a(hj2, string, 0, 1, arrc, arrc.length * Native.c);
        if (n2 != 0) {
            throw new dy(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(hj hj2, String string, String string2, String string3) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131103, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            b.i(hk2.d(), string2, string3);
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static void j(hj hj2, String string, String string2) {
        char[] arrc = Native.c(string2);
        int n2 = a.g.a(hj2, string, 0, 2, arrc, arrc.length * Native.c);
        if (n2 != 0) {
            throw new dy(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(hj hj2, String string, String string2, String string3) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131103, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            b.j(hk2.d(), string2, string3);
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static void a(hj hj2, String string, String[] arrstring) {
        int n2 = 0;
        for (String string2 : arrstring) {
            n2 += string2.length() * Native.c;
            n2 += Native.c;
        }
        int n3 = 0;
        com.sun.jna.ac ac2 = new com.sun.jna.ac(n2);
        for (String string3 : arrstring) {
            ac2.a((long)n3, string3, true);
            n3 += string3.length() * Native.c;
            n3 += Native.c;
        }
        int n4 = a.g.a(hj2, string, 0, 7, ac2.b(0L, n2), n2);
        if (n4 != 0) {
            throw new dy(n4);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(hj hj2, String string, String string2, String[] arrstring) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131103, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            b.a(hk2.d(), string2, arrstring);
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static void a(hj hj2, String string, byte[] arrby) {
        int n2 = a.g.a(hj2, string, 0, 3, arrby, arrby.length);
        if (n2 != 0) {
            throw new dy(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(hj hj2, String string, String string2, byte[] arrby) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131103, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            b.a(hk2.d(), string2, arrby);
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static void c(hj hj2, String string) {
        int n2 = a.g.b(hj2, string);
        if (n2 != 0) {
            throw new dy(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void k(hj hj2, String string, String string2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131103, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            b.c(hk2.d(), string2);
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static void d(hj hj2, String string) {
        int n2 = a.g.a(hj2, string);
        if (n2 != 0) {
            throw new dy(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void l(hj hj2, String string, String string2) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131103, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            b.d(hk2.d(), string2);
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static String[] a(hj hj2) {
        e e2 = new e();
        e e3 = new e();
        int n2 = a.g.a(hj2, null, null, null, e2, e3, null, null, null, null, null, null);
        if (n2 != 0) {
            throw new dy(n2);
        }
        ArrayList<String> arrayList = new ArrayList<String>(e2.d());
        char[] arrc = new char[e3.d() + 1];
        for (int i2 = 0; i2 < e2.d(); ++i2) {
            e e4 = new e(e3.d() + 1);
            n2 = a.g.a(hj2, i2, arrc, e4, (e)null, (char[])null, (e)null, (ea)null);
            if (n2 != 0) {
                throw new dy(n2);
            }
            arrayList.add(Native.a(arrc));
        }
        return arrayList.toArray(new String[0]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String[] e(hj hj2, String string) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131097, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            String[] arrstring = b.a(hk2.d());
            return arrstring;
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static TreeMap b(hj hj2) {
        e e2 = new e();
        e e3 = new e();
        e e4 = new e();
        int n2 = a.g.a(hj2, null, null, null, null, null, null, e2, e3, e4, null, null);
        if (n2 != 0) {
            throw new dy(n2);
        }
        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
        char[] arrc = new char[e3.d() + 1];
        byte[] arrby = new byte[e4.d()];
        block7: for (int i2 = 0; i2 < e2.d(); ++i2) {
            e e5;
            e e6;
            e e7 = new e(e3.d() + 1);
            n2 = a.g.a(hj2, i2, arrc, e7, null, e6 = new e(), arrby, e5 = new e(e4.d()));
            if (n2 != 0) {
                throw new dy(n2);
            }
            String string = Native.a(arrc);
            com.sun.jna.ac ac2 = new com.sun.jna.ac(e5.d());
            ac2.b(0L, arrby, 0, e5.d());
            switch (e6.d()) {
                case 11: {
                    treeMap.put(string, ac2.f(0L));
                    continue block7;
                }
                case 4: {
                    treeMap.put(string, ac2.e(0L));
                    continue block7;
                }
                case 1: 
                case 2: {
                    treeMap.put(string, ac2.a(0L, true));
                    continue block7;
                }
                case 3: {
                    treeMap.put(string, ac2.b(0L, e5.d()));
                    continue block7;
                }
                case 7: {
                    com.sun.jna.ac ac3 = new com.sun.jna.ac(e5.d());
                    ac3.b(0L, arrby, 0, e5.d());
                    ArrayList<String> arrayList = new ArrayList<String>();
                    int n3 = 0;
                    while ((long)n3 < ac3.g()) {
                        String string2 = ac3.a((long)n3, true);
                        n3 += string2.length() * Native.c;
                        n3 += Native.c;
                        arrayList.add(string2);
                    }
                    treeMap.put(string, arrayList.toArray(new String[0]));
                    continue block7;
                }
                default: {
                    throw new RuntimeException("Unsupported type: " + e6.d());
                }
            }
        }
        return treeMap;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static TreeMap f(hj hj2, String string) {
        hk hk2 = new hk();
        int n2 = a.g.a(hj2, string, 0, 131097, hk2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        try {
            TreeMap treeMap = b.b(hk2.d());
            return treeMap;
        }
        finally {
            n2 = a.g.a(hk2.d());
            if (n2 != 0) {
                throw new dy(n2);
            }
        }
    }

    public static String a(Map map) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == null) continue;
            stringBuffer.append((String)entry.getKey() + "=" + (String)entry.getValue() + "\u0000");
        }
        return stringBuffer.toString() + "\u0000";
    }

    public static fx[] a(String string, boolean bl2) {
        Object object;
        int n2 = 4;
        int n3 = 1024;
        boolean bl3 = false;
        com.sun.jna.ac ac2 = null;
        do {
            int n4;
            bl3 = false;
            ac2 = new com.sun.jna.ac(n3);
            object = new e();
            boolean bl4 = a.g.a(new bw(string), n2, ac2, n3, (e)object);
            if (!bl4) {
                n4 = ac.g.f();
                ac2.d();
                if (122 != n4) {
                    throw new dy(n4);
                }
            }
            if (n3 >= (n4 = ((e)object).d())) continue;
            bl3 = true;
            n3 = n4;
            ac2.d();
        } while (bl3);
        object = new gw(ac2);
        ac2.d();
        gc gc2 = ((gw)object).s();
        fx[] arrfx = gc2.s();
        if (bl2) {
            HashMap<String, fx> hashMap = new HashMap<String, fx>();
            for (fx fx2 : arrfx) {
                boolean bl5 = (fx2.F & 0x1F) != 0;
                String string2 = fx2.s() + "/" + bl5 + "/" + fx2.getClass().getName();
                fx fx3 = (fx)hashMap.get(string2);
                if (fx3 != null) {
                    int n5 = fx3.a;
                    fx3.a = n5 |= fx2.a;
                    continue;
                }
                hashMap.put(string2, fx2);
            }
            return hashMap.values().toArray(new fx[hashMap.size()]);
        }
        return arrfx;
    }
}

