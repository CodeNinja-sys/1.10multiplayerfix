/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.u;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public final class o {
    public static final Inet4Address a;
    public static final Inet6Address b;
    public static final InetAddress c;
    public static final NetworkInterface d;
    public static final int e;
    private static final g f;

    public static byte[] a(String string) {
        if (o.d(string)) {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ".");
            byte[] arrby = new byte[4];
            for (int i2 = 0; i2 < 4; ++i2) {
                String string2 = stringTokenizer.nextToken();
                int n2 = Integer.parseInt(string2);
                arrby[i2] = (byte)n2;
            }
            return arrby;
        }
        if (o.b(string)) {
            int n3;
            if (string.charAt(0) == '[') {
                string = string.substring(1, string.length() - 1);
            }
            StringTokenizer stringTokenizer = new StringTokenizer(string, ":.", true);
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<String> arrayList2 = new ArrayList<String>();
            String string3 = "";
            String string4 = "";
            int n4 = -1;
            while (stringTokenizer.hasMoreTokens()) {
                string4 = string3;
                string3 = stringTokenizer.nextToken();
                if (":".equals(string3)) {
                    if (":".equals(string4)) {
                        n4 = arrayList.size();
                        continue;
                    }
                    if (string4.isEmpty()) continue;
                    arrayList.add(string4);
                    continue;
                }
                if (!".".equals(string3)) continue;
                arrayList2.add(string4);
            }
            if (":".equals(string4)) {
                if (":".equals(string3)) {
                    n4 = arrayList.size();
                } else {
                    arrayList.add(string3);
                }
            } else if (".".equals(string4)) {
                arrayList2.add(string3);
            }
            int n5 = 8;
            if (!arrayList2.isEmpty()) {
                n5 -= 2;
            }
            if (n4 != -1) {
                int n6 = n5 - arrayList.size();
                for (n3 = 0; n3 < n6; ++n3) {
                    arrayList.add(n4, "0");
                }
            }
            byte[] arrby = new byte[16];
            for (n3 = 0; n3 < arrayList.size(); ++n3) {
                o.a((String)arrayList.get(n3), arrby, n3 * 2);
            }
            for (n3 = 0; n3 < arrayList2.size(); ++n3) {
                arrby[n3 + 12] = (byte)(Integer.parseInt((String)arrayList2.get(n3)) & 0xFF);
            }
            return arrby;
        }
        return null;
    }

    private static void a(String string, byte[] arrby, int n2) {
        int n3;
        int n4 = string.length();
        int n5 = 0;
        arrby[n2] = 0;
        arrby[n2 + 1] = 0;
        if (n4 > 3) {
            n3 = o.a(string.charAt(n5++));
            int n6 = n2;
            arrby[n6] = (byte)(arrby[n6] | n3 << 4);
        }
        if (n4 > 2) {
            n3 = o.a(string.charAt(n5++));
            int n7 = n2;
            arrby[n7] = (byte)(arrby[n7] | n3);
        }
        if (n4 > 1) {
            n3 = o.a(string.charAt(n5++));
            int n8 = n2 + 1;
            arrby[n8] = (byte)(arrby[n8] | n3 << 4);
        }
        n3 = o.a(string.charAt(n5));
        int n9 = n2 + 1;
        arrby[n9] = (byte)(arrby[n9] | n3 & 0xF);
    }

    static int a(char c2) {
        switch (c2) {
            case '0': {
                return 0;
            }
            case '1': {
                return 1;
            }
            case '2': {
                return 2;
            }
            case '3': {
                return 3;
            }
            case '4': {
                return 4;
            }
            case '5': {
                return 5;
            }
            case '6': {
                return 6;
            }
            case '7': {
                return 7;
            }
            case '8': {
                return 8;
            }
            case '9': {
                return 9;
            }
        }
        c2 = Character.toLowerCase(c2);
        switch (c2) {
            case 'a': {
                return 10;
            }
            case 'b': {
                return 11;
            }
            case 'c': {
                return 12;
            }
            case 'd': {
                return 13;
            }
            case 'e': {
                return 14;
            }
            case 'f': {
                return 15;
            }
        }
        return 0;
    }

    public static boolean b(String string) {
        int n2 = string.length();
        boolean bl2 = false;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = '\u0000';
        int n6 = 0;
        if (n2 < 2) {
            return false;
        }
        block9: for (int i2 = 0; i2 < n2; ++i2) {
            char c3 = c2;
            c2 = string.charAt(i2);
            switch (c2) {
                case '[': {
                    if (i2 != 0) {
                        return false;
                    }
                    if (string.charAt(n2 - 1) != ']') {
                        return false;
                    }
                    n6 = 1;
                    if (n2 >= 4) continue block9;
                    return false;
                }
                case ']': {
                    if (i2 != n2 - 1) {
                        return false;
                    }
                    if (string.charAt(0) == '[') continue block9;
                    return false;
                }
                case '.': {
                    if (++n4 > 3) {
                        return false;
                    }
                    if (!o.c(stringBuilder.toString())) {
                        return false;
                    }
                    if (n3 != 6 && !bl2) {
                        return false;
                    }
                    if (n3 == 7 && string.charAt(n6) != ':' && string.charAt(1 + n6) != ':') {
                        return false;
                    }
                    stringBuilder.delete(0, stringBuilder.length());
                    continue block9;
                }
                case ':': {
                    if (i2 == n6 && (string.length() <= i2 || string.charAt(i2 + 1) != ':')) {
                        return false;
                    }
                    if (++n3 > 7) {
                        return false;
                    }
                    if (n4 > 0) {
                        return false;
                    }
                    if (c3 == ':') {
                        if (bl2) {
                            return false;
                        }
                        bl2 = true;
                    }
                    stringBuilder.delete(0, stringBuilder.length());
                    continue block9;
                }
                case '%': {
                    if (n3 == 0) {
                        return false;
                    }
                    ++n5;
                    if (i2 + 1 >= n2) {
                        return false;
                    }
                    try {
                        if (Integer.parseInt(string.substring(i2 + 1)) >= 0) continue block9;
                        return false;
                    }
                    catch (NumberFormatException numberFormatException) {
                        return false;
                    }
                }
                default: {
                    if (n5 == 0) {
                        if (stringBuilder != null && stringBuilder.length() > 3) {
                            return false;
                        }
                        if (!o.b(c2)) {
                            return false;
                        }
                    }
                    stringBuilder.append(c2);
                }
            }
        }
        if (n4 > 0) {
            if (n4 != 3 || !o.c(stringBuilder.toString()) || n3 >= 7) {
                return false;
            }
        } else {
            if (n3 != 7 && !bl2) {
                return false;
            }
            if (n5 == 0 && stringBuilder.length() == 0 && string.charAt(n2 - 1 - n6) == ':' && string.charAt(n2 - 2 - n6) != ':') {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String string) {
        if (string.length() < 1 || string.length() > 3) {
            return false;
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 >= '0' && c2 <= '9') continue;
            return false;
        }
        return Integer.parseInt(string) <= 255;
    }

    static boolean b(char c2) {
        return c2 >= '0' && c2 <= '9' || c2 >= 'A' && c2 <= 'F' || c2 >= 'a' && c2 <= 'f';
    }

    public static boolean d(String string) {
        int n2 = 0;
        int n3 = string.length();
        if (n3 > 15) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < n3; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '.') {
                if (++n2 > 3) {
                    return false;
                }
                if (stringBuilder.length() == 0) {
                    return false;
                }
                if (Integer.parseInt(stringBuilder.toString()) > 255) {
                    return false;
                }
                stringBuilder.delete(0, stringBuilder.length());
                continue;
            }
            if (!Character.isDigit(c2)) {
                return false;
            }
            if (stringBuilder.length() > 2) {
                return false;
            }
            stringBuilder.append(c2);
        }
        if (stringBuilder.length() == 0 || Integer.parseInt(stringBuilder.toString()) > 255) {
            return false;
        }
        return n2 == 3;
    }

    private o() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static {
        block40: {
            o.f = h.a(o.class);
            var0 = new byte[]{127, 0, 0, 1};
            var1_1 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
            var2_2 = null;
            try {
                var2_2 = (Inet4Address)InetAddress.getByAddress(var0);
            }
            catch (Exception var3_3) {
                u.a(var3_3);
            }
            o.a = var2_2;
            var3_4 = null;
            try {
                var3_4 = (Inet6Address)InetAddress.getByAddress(var1_1);
            }
            catch (Exception var4_5) {
                u.a(var4_5);
            }
            o.b = var3_4;
            var4_6 = new ArrayList<NetworkInterface>();
            try {
                var5_7 = NetworkInterface.getNetworkInterfaces();
                while (var5_7.hasMoreElements()) {
                    var6_9 = var5_7.nextElement();
                    if (!var6_9.getInetAddresses().hasMoreElements()) continue;
                    var4_6.add((NetworkInterface)var6_9);
                }
            }
            catch (SocketException var5_8) {
                o.f.d("Failed to retrieve the list of available network interfaces", var5_8);
            }
            var5_7 = null;
            var6_9 = null;
            block24: for (NetworkInterface var8_14 : var4_6) {
                var9_18 = var8_14.getInetAddresses();
                while (var9_18.hasMoreElements()) {
                    var10_19 = var9_18.nextElement();
                    if (!var10_19.isLoopbackAddress()) continue;
                    var5_7 = var8_14;
                    var6_9 = var10_19;
                    break block24;
                }
            }
            if (var5_7 == null) {
                try {
                    for (NetworkInterface var8_16 : var4_6) {
                        if (!var8_16.isLoopback() || !(var9_18 = var8_16.getInetAddresses()).hasMoreElements()) continue;
                        var5_7 = var8_16;
                        var6_9 = var9_18.nextElement();
                        break;
                    }
                    if (var5_7 == null) {
                        o.f.d("Failed to find the loopback interface");
                    }
                }
                catch (SocketException var7_11) {
                    o.f.d("Failed to find the loopback interface", var7_11);
                }
            }
            if (var5_7 != null) {
                o.f.b("Loopback interface: {} ({}, {})", new Object[]{var5_7.getName(), var5_7.getDisplayName(), var6_9.getHostAddress()});
            } else if (var6_9 == null) {
                try {
                    if (NetworkInterface.getByInetAddress(o.b) != null) {
                        o.f.b("Using hard-coded IPv6 localhost address: {}", (Object)var3_4);
                        var6_9 = var3_4;
                    }
                }
                catch (Exception var7_12) {
                }
                finally {
                    if (var6_9 == null) {
                        o.f.b("Using hard-coded IPv4 localhost address: {}", (Object)var2_2);
                        var6_9 = var2_2;
                    }
                }
            }
            o.d = var5_7;
            o.c = var6_9;
            var7_13 = u.b() != false ? 200 : 128;
            var8_17 = new File("/proc/sys/net/core/somaxconn");
            if (var8_17.exists()) {
                var9_18 = null;
                try {
                    var9_18 = new BufferedReader(new FileReader(var8_17));
                    var7_13 = Integer.parseInt(var9_18.readLine());
                    if (o.f.d()) {
                        o.f.b("{}: {}", (Object)var8_17, (Object)var7_13);
                    }
                    ** if (var9_18 == null) goto lbl-1000
                }
                catch (Exception var10_21) {
                    try {
                        o.f.b("Failed to get SOMAXCONN from: {}", (Object)var8_17, (Object)var10_21);
                        ** if (var9_18 == null) goto lbl-1000
                    }
                    catch (Throwable var12_24) {
                        if (var9_18 == null) throw var12_24;
                        try {
                            var9_18.close();
                            throw var12_24;
                        }
                        catch (Exception var13_25) {
                            // empty catch block
                        }
                        throw var12_24;
                    }
lbl-1000:
                    // 1 sources

                    {
                        try {
                            var9_18.close();
                        }
                        catch (Exception var10_22) {}
                    }
lbl-1000:
                    // 2 sources

                    {
                        break block40;
                    }
                }
lbl-1000:
                // 1 sources

                {
                    try {
                        var9_18.close();
                    }
                    catch (Exception var10_20) {}
                }
lbl-1000:
                // 2 sources

                {
                    break block40;
                }
            }
            if (o.f.d()) {
                o.f.b("{}: {} (non-existent)", (Object)var8_17, (Object)var7_13);
            }
        }
        o.e = var7_13;
    }
}

