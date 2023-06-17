/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.ar;
import io.netty.util.e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class br
implements Comparable {
    private static final Pattern c = Pattern.compile("(\\S+)/(\\d+)\\.(\\d+)");
    private static final String d = "HTTP/1.0";
    private static final String e = "HTTP/1.1";
    public static final br a = new br("HTTP", 1, 0, false, true);
    public static final br b = new br("HTTP", 1, 1, true, true);
    private final String f;
    private final int g;
    private final int h;
    private final String i;
    private final boolean j;
    private final byte[] k;

    public static br a(String string) {
        if (string == null) {
            throw new NullPointerException("text");
        }
        if ((string = string.trim()).isEmpty()) {
            throw new IllegalArgumentException("text is empty");
        }
        br br2 = br.b(string);
        if (br2 == null && (br2 = br.b(string = string.toUpperCase())) == null) {
            br2 = new br(string, true);
        }
        return br2;
    }

    private static br b(String string) {
        if (e.equals(string)) {
            return b;
        }
        if (d.equals(string)) {
            return a;
        }
        return null;
    }

    public br(String string, boolean bl2) {
        if (string == null) {
            throw new NullPointerException("text");
        }
        if ((string = string.trim().toUpperCase()).isEmpty()) {
            throw new IllegalArgumentException("empty text");
        }
        Matcher matcher = c.matcher(string);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("invalid version format: " + string);
        }
        this.f = matcher.group(1);
        this.g = Integer.parseInt(matcher.group(2));
        this.h = Integer.parseInt(matcher.group(3));
        this.i = this.f + '/' + this.g + '.' + this.h;
        this.j = bl2;
        this.k = null;
    }

    public br(String string, int n2, int n3, boolean bl2) {
        this(string, n2, n3, bl2, false);
    }

    private br(String string, int n2, int n3, boolean bl2, boolean bl3) {
        if (string == null) {
            throw new NullPointerException("protocolName");
        }
        if ((string = string.trim().toUpperCase()).isEmpty()) {
            throw new IllegalArgumentException("empty protocolName");
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (!Character.isISOControl(string.charAt(i2)) && !Character.isWhitespace(string.charAt(i2))) continue;
            throw new IllegalArgumentException("invalid character in protocolName");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("negative majorVersion");
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("negative minorVersion");
        }
        this.f = string;
        this.g = n2;
        this.h = n3;
        this.i = string + '/' + n2 + '.' + n3;
        this.j = bl2;
        this.k = (byte[])(bl3 ? this.i.getBytes(io.netty.util.e.f) : null);
    }

    public String a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public String d() {
        return this.i;
    }

    public boolean e() {
        return this.j;
    }

    public String toString() {
        return this.d();
    }

    public int hashCode() {
        return (this.a().hashCode() * 31 + this.b()) * 31 + this.c();
    }

    public boolean equals(Object object) {
        if (!(object instanceof br)) {
            return false;
        }
        br br2 = (br)object;
        return this.c() == br2.c() && this.b() == br2.b() && this.a().equals(br2.a());
    }

    public int a(br br2) {
        int n2 = this.a().compareTo(br2.a());
        if (n2 != 0) {
            return n2;
        }
        n2 = this.b() - br2.b();
        if (n2 != 0) {
            return n2;
        }
        return this.c() - br2.c();
    }

    void a(g g2) {
        if (this.k == null) {
            ar.b(this.i, g2);
        } else {
            g2.c(this.k);
        }
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((br)object);
    }
}

