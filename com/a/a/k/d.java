/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.k;

import com.a.a.b.cl;
import com.a.a.g.ak;
import com.a.a.i.z;
import com.a.a.k.e;
import com.a.a.l.q;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class d {
    private static final int a = 4;
    private static final int b = 8;
    private static final Inet4Address c = (Inet4Address)com.a.a.k.d.a("127.0.0.1");
    private static final Inet4Address d = (Inet4Address)com.a.a.k.d.a("0.0.0.0");

    private d() {
    }

    private static Inet4Address b(byte[] arrby) {
        cl.a(arrby.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", new Object[]{arrby.length});
        return (Inet4Address)com.a.a.k.d.c(arrby);
    }

    public static InetAddress a(String string) {
        byte[] arrby = com.a.a.k.d.f(string);
        if (arrby == null) {
            throw new IllegalArgumentException(String.format("'%s' is not an IP string literal.", string));
        }
        return com.a.a.k.d.c(arrby);
    }

    public static boolean b(String string) {
        return com.a.a.k.d.f(string) != null;
    }

    private static byte[] f(String string) {
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '.') {
                bl3 = true;
                continue;
            }
            if (c2 == ':') {
                if (bl3) {
                    return null;
                }
                bl2 = true;
                continue;
            }
            if (Character.digit(c2, 16) != -1) continue;
            return null;
        }
        if (bl2) {
            if (bl3 && (string = com.a.a.k.d.i(string)) == null) {
                return null;
            }
            return com.a.a.k.d.h(string);
        }
        if (bl3) {
            return com.a.a.k.d.g(string);
        }
        return null;
    }

    private static byte[] g(String string) {
        String[] arrstring = string.split("\\.", 5);
        if (arrstring.length != 4) {
            return null;
        }
        byte[] arrby = new byte[4];
        try {
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                arrby[i2] = com.a.a.k.d.j(arrstring[i2]);
            }
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return arrby;
    }

    private static byte[] h(String string) {
        int n2;
        int n3;
        String[] arrstring = string.split(":", 10);
        if (arrstring.length < 3 || arrstring.length > 9) {
            return null;
        }
        int n4 = -1;
        for (n3 = 1; n3 < arrstring.length - 1; ++n3) {
            if (arrstring[n3].length() != 0) continue;
            if (n4 >= 0) {
                return null;
            }
            n4 = n3;
        }
        if (n4 >= 0) {
            n3 = n4;
            n2 = arrstring.length - n4 - 1;
            if (arrstring[0].length() == 0 && --n3 != 0) {
                return null;
            }
            if (arrstring[arrstring.length - 1].length() == 0 && --n2 != 0) {
                return null;
            }
        } else {
            n3 = arrstring.length;
            n2 = 0;
        }
        int n5 = 8 - (n3 + n2);
        if (!(n4 < 0 ? n5 == 0 : n5 >= 1)) {
            return null;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        try {
            int n6;
            for (n6 = 0; n6 < n3; ++n6) {
                byteBuffer.putShort(com.a.a.k.d.k(arrstring[n6]));
            }
            for (n6 = 0; n6 < n5; ++n6) {
                byteBuffer.putShort((short)0);
            }
            for (n6 = n2; n6 > 0; --n6) {
                byteBuffer.putShort(com.a.a.k.d.k(arrstring[arrstring.length - n6]));
            }
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return byteBuffer.array();
    }

    private static String i(String string) {
        int n2 = string.lastIndexOf(58);
        String string2 = string.substring(0, n2 + 1);
        String string3 = string.substring(n2 + 1);
        byte[] arrby = com.a.a.k.d.g(string3);
        if (arrby == null) {
            return null;
        }
        String string4 = Integer.toHexString((arrby[0] & 0xFF) << 8 | arrby[1] & 0xFF);
        String string5 = Integer.toHexString((arrby[2] & 0xFF) << 8 | arrby[3] & 0xFF);
        return string2 + string4 + ":" + string5;
    }

    private static byte j(String string) {
        int n2 = Integer.parseInt(string);
        if (n2 > 255 || string.startsWith("0") && string.length() > 1) {
            throw new NumberFormatException();
        }
        return (byte)n2;
    }

    private static short k(String string) {
        int n2 = Integer.parseInt(string, 16);
        if (n2 > 65535) {
            throw new NumberFormatException();
        }
        return (short)n2;
    }

    private static InetAddress c(byte[] arrby) {
        try {
            return InetAddress.getByAddress(arrby);
        }
        catch (UnknownHostException unknownHostException) {
            throw new AssertionError((Object)unknownHostException);
        }
    }

    public static String a(InetAddress inetAddress) {
        cl.a(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        cl.a(inetAddress instanceof Inet6Address);
        byte[] arrby = inetAddress.getAddress();
        int[] arrn = new int[8];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn[i2] = q.a((byte)0, (byte)0, arrby[2 * i2], arrby[2 * i2 + 1]);
        }
        com.a.a.k.d.a(arrn);
        return com.a.a.k.d.b(arrn);
    }

    private static void a(int[] arrn) {
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        for (int i2 = 0; i2 < arrn.length + 1; ++i2) {
            if (i2 < arrn.length && arrn[i2] == 0) {
                if (n4 >= 0) continue;
                n4 = i2;
                continue;
            }
            if (n4 < 0) continue;
            int n5 = i2 - n4;
            if (n5 > n3) {
                n2 = n4;
                n3 = n5;
            }
            n4 = -1;
        }
        if (n3 >= 2) {
            Arrays.fill(arrn, n2, n2 + n3, -1);
        }
    }

    private static String b(int[] arrn) {
        StringBuilder stringBuilder = new StringBuilder(39);
        boolean bl2 = false;
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            boolean bl3;
            boolean bl4 = bl3 = arrn[i2] >= 0;
            if (bl3) {
                if (bl2) {
                    stringBuilder.append(':');
                }
                stringBuilder.append(Integer.toHexString(arrn[i2]));
            } else if (i2 == 0 || bl2) {
                stringBuilder.append("::");
            }
            bl2 = bl3;
        }
        return stringBuilder.toString();
    }

    public static String b(InetAddress inetAddress) {
        if (inetAddress instanceof Inet6Address) {
            return "[" + com.a.a.k.d.a(inetAddress) + "]";
        }
        return com.a.a.k.d.a(inetAddress);
    }

    public static InetAddress c(String string) {
        int n2;
        String string2;
        cl.a(string);
        if (string.startsWith("[") && string.endsWith("]")) {
            string2 = string.substring(1, string.length() - 1);
            n2 = 16;
        } else {
            string2 = string;
            n2 = 4;
        }
        byte[] arrby = com.a.a.k.d.f(string2);
        if (arrby == null || arrby.length != n2) {
            throw new IllegalArgumentException(String.format("Not a valid URI IP literal: '%s'", string));
        }
        return com.a.a.k.d.c(arrby);
    }

    public static boolean d(String string) {
        try {
            com.a.a.k.d.c(string);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public static boolean a(Inet6Address inet6Address) {
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] arrby = inet6Address.getAddress();
        return arrby[12] != 0 || arrby[13] != 0 || arrby[14] != 0 || arrby[15] != 0 && arrby[15] != 1;
    }

    public static Inet4Address b(Inet6Address inet6Address) {
        cl.a(com.a.a.k.d.a(inet6Address), "Address '%s' is not IPv4-compatible.", new Object[]{com.a.a.k.d.a((InetAddress)inet6Address)});
        return com.a.a.k.d.b(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static boolean c(Inet6Address inet6Address) {
        byte[] arrby = inet6Address.getAddress();
        return arrby[0] == 32 && arrby[1] == 2;
    }

    public static Inet4Address d(Inet6Address inet6Address) {
        cl.a(com.a.a.k.d.c(inet6Address), "Address '%s' is not a 6to4 address.", new Object[]{com.a.a.k.d.a((InetAddress)inet6Address)});
        return com.a.a.k.d.b(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static boolean e(Inet6Address inet6Address) {
        byte[] arrby = inet6Address.getAddress();
        return arrby[0] == 32 && arrby[1] == 1 && arrby[2] == 0 && arrby[3] == 0;
    }

    public static e f(Inet6Address inet6Address) {
        cl.a(com.a.a.k.d.e(inet6Address), "Address '%s' is not a Teredo address.", new Object[]{com.a.a.k.d.a((InetAddress)inet6Address)});
        byte[] arrby = inet6Address.getAddress();
        Inet4Address inet4Address = com.a.a.k.d.b(Arrays.copyOfRange(arrby, 4, 8));
        int n2 = z.a(arrby, 8).readShort() & 0xFFFF;
        int n3 = ~z.a(arrby, 10).readShort() & 0xFFFF;
        byte[] arrby2 = Arrays.copyOfRange(arrby, 12, 16);
        for (int i2 = 0; i2 < arrby2.length; ++i2) {
            arrby2[i2] = ~arrby2[i2];
        }
        Inet4Address inet4Address2 = com.a.a.k.d.b(arrby2);
        return new e(inet4Address, inet4Address2, n3, n2);
    }

    public static boolean g(Inet6Address inet6Address) {
        if (com.a.a.k.d.e(inet6Address)) {
            return false;
        }
        byte[] arrby = inet6Address.getAddress();
        if ((arrby[8] | 3) != 3) {
            return false;
        }
        return arrby[9] == 0 && arrby[10] == 94 && arrby[11] == -2;
    }

    public static Inet4Address h(Inet6Address inet6Address) {
        cl.a(com.a.a.k.d.g(inet6Address), "Address '%s' is not an ISATAP address.", new Object[]{com.a.a.k.d.a((InetAddress)inet6Address)});
        return com.a.a.k.d.b(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static boolean i(Inet6Address inet6Address) {
        return com.a.a.k.d.a(inet6Address) || com.a.a.k.d.c(inet6Address) || com.a.a.k.d.e(inet6Address);
    }

    public static Inet4Address j(Inet6Address inet6Address) {
        if (com.a.a.k.d.a(inet6Address)) {
            return com.a.a.k.d.b(inet6Address);
        }
        if (com.a.a.k.d.c(inet6Address)) {
            return com.a.a.k.d.d(inet6Address);
        }
        if (com.a.a.k.d.e(inet6Address)) {
            return com.a.a.k.d.f(inet6Address).b();
        }
        throw new IllegalArgumentException(String.format("'%s' has no embedded IPv4 address.", com.a.a.k.d.a((InetAddress)inet6Address)));
    }

    public static boolean e(String string) {
        byte[] arrby = com.a.a.k.d.f(string);
        if (arrby != null && arrby.length == 16) {
            int n2;
            for (n2 = 0; n2 < 10; ++n2) {
                if (arrby[n2] == 0) continue;
                return false;
            }
            for (n2 = 10; n2 < 12; ++n2) {
                if (arrby[n2] == -1) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static Inet4Address c(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address)inetAddress;
        }
        byte[] arrby = inetAddress.getAddress();
        boolean bl2 = true;
        for (int i2 = 0; i2 < 15; ++i2) {
            if (arrby[i2] == 0) continue;
            bl2 = false;
            break;
        }
        if (bl2 && arrby[15] == 1) {
            return c;
        }
        if (bl2 && arrby[15] == 0) {
            return d;
        }
        Inet6Address inet6Address = (Inet6Address)inetAddress;
        long l2 = 0L;
        l2 = com.a.a.k.d.i(inet6Address) ? (long)com.a.a.k.d.j(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong();
        int n2 = ak.a().a(l2).b();
        if ((n2 |= 0xE0000000) == -1) {
            n2 = -2;
        }
        return com.a.a.k.d.b(q.b(n2));
    }

    public static int d(InetAddress inetAddress) {
        return z.b(com.a.a.k.d.c(inetAddress).getAddress()).readInt();
    }

    public static Inet4Address a(int n2) {
        return com.a.a.k.d.b(q.b(n2));
    }

    public static InetAddress a(byte[] arrby) {
        byte[] arrby2 = new byte[arrby.length];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrby2[i2] = arrby[arrby.length - i2 - 1];
        }
        return InetAddress.getByAddress(arrby2);
    }

    public static InetAddress e(InetAddress inetAddress) {
        int n2;
        byte[] arrby = inetAddress.getAddress();
        for (n2 = arrby.length - 1; n2 >= 0 && arrby[n2] == -1; --n2) {
            arrby[n2] = 0;
        }
        cl.a(n2 >= 0, "Incrementing %s would wrap.", new Object[]{inetAddress});
        int n3 = n2;
        arrby[n3] = (byte)(arrby[n3] + 1);
        return com.a.a.k.d.c(arrby);
    }

    public static boolean f(InetAddress inetAddress) {
        byte[] arrby = inetAddress.getAddress();
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            if (arrby[i2] == -1) continue;
            return false;
        }
        return true;
    }

    static /* synthetic */ Inet4Address a() {
        return d;
    }
}

