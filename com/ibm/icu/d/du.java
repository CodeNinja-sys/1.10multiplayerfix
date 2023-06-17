/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.c.a;
import java.math.BigDecimal;
import java.math.BigInteger;

final class du {
    public static final int a = 19;
    public static final int b = 17;
    public int c = 0;
    public int d = 0;
    public byte[] e = new byte[19];
    private static byte[] f;

    du() {
    }

    private final void a(int n2, int n3) {
        if (n2 > this.e.length) {
            byte[] arrby = new byte[n2 * 2];
            System.arraycopy(this.e, 0, arrby, 0, n3);
            this.e = arrby;
        }
    }

    boolean a() {
        for (int i2 = 0; i2 < this.d; ++i2) {
            if (this.e[i2] == 48) continue;
            return false;
        }
        return true;
    }

    public void a(int n2) {
        this.a(this.d + 1, this.d);
        this.e[this.d++] = (byte)n2;
    }

    public byte b(int n2) {
        return (byte)(this.e[n2] - 48);
    }

    public final double b() {
        if (this.d == 0) {
            return 0.0;
        }
        StringBuilder stringBuilder = new StringBuilder(this.d);
        stringBuilder.append('.');
        for (int i2 = 0; i2 < this.d; ++i2) {
            stringBuilder.append((char)this.e[i2]);
        }
        stringBuilder.append('E');
        stringBuilder.append(Integer.toString(this.c));
        return Double.valueOf(stringBuilder.toString());
    }

    public final long c() {
        if (this.d == 0) {
            return 0L;
        }
        if (this.e()) {
            return Long.MIN_VALUE;
        }
        StringBuilder stringBuilder = new StringBuilder(this.d);
        for (int i2 = 0; i2 < this.c; ++i2) {
            stringBuilder.append(i2 < this.d ? (char)this.e[i2] : (char)'0');
        }
        return Long.parseLong(stringBuilder.toString());
    }

    public BigInteger a(boolean bl2) {
        int n2;
        int n3;
        if (this.a()) {
            return BigInteger.valueOf(0L);
        }
        int n4 = n3 = this.c > this.d ? this.c : this.d;
        if (!bl2) {
            ++n3;
        }
        char[] arrc = new char[n3];
        int n5 = 0;
        if (!bl2) {
            arrc[0] = 45;
            for (n2 = 0; n2 < this.d; ++n2) {
                arrc[n2 + 1] = (char)this.e[n2];
            }
            n5 = this.d + 1;
        } else {
            for (n2 = 0; n2 < this.d; ++n2) {
                arrc[n2] = (char)this.e[n2];
            }
            n5 = this.d;
        }
        for (n2 = n5; n2 < arrc.length; ++n2) {
            arrc[n2] = 48;
        }
        return new BigInteger(new String(arrc));
    }

    private String d(boolean bl2) {
        int n2;
        if (this.a()) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder(this.d + 1);
        if (!bl2) {
            stringBuilder.append('-');
        }
        if ((n2 = this.c) < 0) {
            stringBuilder.append('.');
            while (n2 < 0) {
                stringBuilder.append('0');
                ++n2;
            }
            n2 = -1;
        }
        for (int i2 = 0; i2 < this.d; ++i2) {
            if (n2 == i2) {
                stringBuilder.append('.');
            }
            stringBuilder.append((char)this.e[i2]);
        }
        while (n2-- > this.d) {
            stringBuilder.append('0');
        }
        return stringBuilder.toString();
    }

    public BigDecimal b(boolean bl2) {
        if (this.a()) {
            return BigDecimal.valueOf(0L);
        }
        long l2 = (long)this.d - (long)this.c;
        if (l2 > 0L) {
            int n2 = this.d;
            if (l2 > Integer.MAX_VALUE) {
                long l3 = l2 - Integer.MAX_VALUE;
                if (l3 < (long)this.d) {
                    n2 = (int)((long)n2 - l3);
                } else {
                    return new BigDecimal(0);
                }
            }
            StringBuilder stringBuilder = new StringBuilder(n2 + 1);
            if (!bl2) {
                stringBuilder.append('-');
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                stringBuilder.append((char)this.e[i2]);
            }
            BigInteger bigInteger = new BigInteger(stringBuilder.toString());
            return new BigDecimal(bigInteger, (int)l2);
        }
        return new BigDecimal(this.d(bl2));
    }

    public a c(boolean bl2) {
        if (this.a()) {
            return com.ibm.icu.c.a.a(0L);
        }
        long l2 = (long)this.d - (long)this.c;
        if (l2 > 0L) {
            int n2 = this.d;
            if (l2 > Integer.MAX_VALUE) {
                long l3 = l2 - Integer.MAX_VALUE;
                if (l3 < (long)this.d) {
                    n2 = (int)((long)n2 - l3);
                } else {
                    return new a(0);
                }
            }
            StringBuilder stringBuilder = new StringBuilder(n2 + 1);
            if (!bl2) {
                stringBuilder.append('-');
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                stringBuilder.append((char)this.e[i2]);
            }
            BigInteger bigInteger = new BigInteger(stringBuilder.toString());
            return new a(bigInteger, (int)l2);
        }
        return new a(this.d(bl2));
    }

    boolean d() {
        while (this.d > 0 && this.e[this.d - 1] == 48) {
            --this.d;
        }
        return this.d == 0 || this.c >= this.d;
    }

    final void a(double d2, int n2, boolean bl2) {
        if (d2 == 0.0) {
            d2 = 0.0;
        }
        String string = Double.toString(d2);
        this.a(string, 19);
        if (bl2) {
            if (-this.c > n2) {
                this.d = 0;
                return;
            }
            if (-this.c == n2) {
                if (this.d(0)) {
                    this.d = 1;
                    ++this.c;
                    this.e[0] = 49;
                } else {
                    this.d = 0;
                }
                return;
            }
        }
        while (this.d > 1 && this.e[this.d - 1] == 48) {
            --this.d;
        }
        this.c(bl2 ? n2 + this.c : (n2 == 0 ? -1 : n2));
    }

    private void a(String string, int n2) {
        this.c = -1;
        this.d = 0;
        int n3 = 0;
        int n4 = 0;
        boolean bl2 = false;
        int n5 = 0;
        if (string.charAt(n5) == '-') {
            ++n5;
        }
        while (n5 < string.length()) {
            char c2 = string.charAt(n5);
            if (c2 == '.') {
                this.c = this.d;
            } else {
                if (c2 == 'e' || c2 == 'E') {
                    if (string.charAt(++n5) == '+') {
                        ++n5;
                    }
                    n3 = Integer.valueOf(string.substring(n5));
                    break;
                }
                if (this.d < n2) {
                    if (!bl2) {
                        boolean bl3 = bl2 = c2 != '0';
                        if (!bl2 && this.c != -1) {
                            ++n4;
                        }
                    }
                    if (bl2) {
                        this.a(this.d + 1, this.d);
                        this.e[this.d++] = (byte)c2;
                    }
                }
            }
            ++n5;
        }
        if (this.c == -1) {
            this.c = this.d;
        }
        this.c += n3 - n4;
    }

    private boolean d(int n2) {
        if (n2 < this.d) {
            if (this.e[n2] > 53) {
                return true;
            }
            if (this.e[n2] == 53) {
                for (int i2 = n2 + 1; i2 < this.d; ++i2) {
                    if (this.e[i2] == 48) continue;
                    return true;
                }
                return n2 > 0 && this.e[n2 - 1] % 2 != 0;
            }
        }
        return false;
    }

    public final void c(int n2) {
        if (n2 >= 0 && n2 < this.d) {
            if (this.d(n2)) {
                do {
                    if (--n2 < 0) {
                        this.e[0] = 49;
                        ++this.c;
                        n2 = 0;
                        break;
                    }
                    int n3 = n2;
                    this.e[n3] = (byte)(this.e[n3] + 1);
                } while (this.e[n2] > 57);
                ++n2;
            }
            this.d = n2;
        }
        while (this.d > 1 && this.e[this.d - 1] == 48) {
            --this.d;
        }
    }

    public final void a(long l2) {
        this.a(l2, 0);
    }

    public final void a(long l2, int n2) {
        if (l2 <= 0L) {
            if (l2 == Long.MIN_VALUE) {
                this.d = 19;
                this.c = 19;
                System.arraycopy(f, 0, this.e, 0, this.d);
            } else {
                this.d = 0;
                this.c = 0;
            }
        } else {
            int n3 = 19;
            while (l2 > 0L) {
                this.e[--n3] = (byte)(48L + l2 % 10L);
                l2 /= 10L;
            }
            this.c = 19 - n3;
            int n4 = 18;
            while (this.e[n4] == 48) {
                --n4;
            }
            this.d = n4 - n3 + 1;
            System.arraycopy(this.e, n3, this.e, 0, this.d);
        }
        if (n2 > 0) {
            this.c(n2);
        }
    }

    public final void a(BigInteger bigInteger, int n2) {
        String string = bigInteger.toString();
        this.d = this.c = string.length();
        while (this.d > 1 && string.charAt(this.d - 1) == '0') {
            --this.d;
        }
        int n3 = 0;
        if (string.charAt(0) == '-') {
            ++n3;
            --this.d;
            --this.c;
        }
        this.a(this.d, 0);
        for (int i2 = 0; i2 < this.d; ++i2) {
            this.e[i2] = (byte)string.charAt(i2 + n3);
        }
        if (n2 > 0) {
            this.c(n2);
        }
    }

    private void a(String string, int n2, boolean bl2) {
        this.a(string, string.length());
        this.c(bl2 ? n2 + this.c : (n2 == 0 ? -1 : n2));
    }

    public final void a(BigDecimal bigDecimal, int n2, boolean bl2) {
        this.a(bigDecimal.toString(), n2, bl2);
    }

    public final void a(a a2, int n2, boolean bl2) {
        this.a(a2.toString(), n2, bl2);
    }

    private boolean e() {
        if (this.c != this.d || this.d != 19) {
            return false;
        }
        for (int i2 = 0; i2 < this.d; ++i2) {
            if (this.e[i2] == f[i2]) continue;
            return false;
        }
        return true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof du)) {
            return false;
        }
        du du2 = (du)object;
        if (this.d != du2.d || this.c != du2.c) {
            return false;
        }
        for (int i2 = 0; i2 < this.d; ++i2) {
            if (this.e[i2] == du2.e[i2]) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n2 = this.c;
        for (int i2 = 0; i2 < this.d; ++i2) {
            n2 = n2 * 37 + this.e[i2];
        }
        return n2;
    }

    public String toString() {
        if (this.a()) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder("0.");
        for (int i2 = 0; i2 < this.d; ++i2) {
            stringBuilder.append((char)this.e[i2]);
        }
        stringBuilder.append("x10^");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    static {
        String string = Long.toString(Long.MIN_VALUE);
        f = new byte[19];
        for (int i2 = 0; i2 < 19; ++i2) {
            du.f[i2] = (byte)string.charAt(i2 + 1);
        }
    }
}

