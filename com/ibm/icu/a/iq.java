/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ag;
import com.ibm.icu.a.am;
import com.ibm.icu.a.ck;
import com.ibm.icu.a.is;
import com.ibm.icu.util.e;
import com.ibm.icu.util.i;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.MissingResourceException;

public final class iq {
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private int[] f;
    private byte[] g;
    private String h;
    private static final is i = new is(null);
    private static final byte[] j = new byte[]{112, 110, 97, 109};
    public static final iq a;

    private void a(InputStream inputStream) {
        int n2;
        int n3;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ag.a(bufferedInputStream, j, i);
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        int n4 = dataInputStream.readInt() / 4;
        if (n4 < 8) {
            throw new IOException("pnames.icu: not enough indexes");
        }
        int[] arrn = new int[n4];
        arrn[0] = n4 * 4;
        for (n3 = 1; n3 < n4; ++n3) {
            arrn[n3] = dataInputStream.readInt();
        }
        n3 = arrn[0];
        int n5 = arrn[1];
        int n6 = (n5 - n3) / 4;
        this.f = new int[n6];
        for (n2 = 0; n2 < n6; ++n2) {
            this.f[n2] = dataInputStream.readInt();
        }
        n3 = n5;
        n5 = arrn[2];
        n2 = n5 - n3;
        this.g = new byte[n2];
        dataInputStream.readFully(this.g);
        n3 = n5;
        n5 = arrn[3];
        n2 = n5 - n3;
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append((char)dataInputStream.readByte());
        }
        this.h = stringBuilder.toString();
        inputStream.close();
    }

    private iq() {
        this.a(am.c("data/icudt51b/pnames.icu"));
    }

    private int a(int n2) {
        int n3 = 1;
        for (int i2 = this.f[0]; i2 > 0; --i2) {
            int n4 = this.f[n3];
            int n5 = this.f[n3 + 1];
            n3 += 2;
            if (n2 < n4) break;
            if (n2 < n5) {
                return n3 + (n2 - n4) * 2;
            }
            n3 += (n5 - n4) * 2;
        }
        return 0;
    }

    private int b(int n2, int n3) {
        if (n2 == 0) {
            return 0;
        }
        int n4 = ++n2;
        ++n2;
        int n5 = this.f[n4];
        if (n5 < 16) {
            while (n5 > 0) {
                int n6 = this.f[n2];
                int n7 = this.f[n2 + 1];
                n2 += 2;
                if (n3 >= n6) {
                    if (n3 < n7) {
                        return this.f[n2 + n3 - n6];
                    }
                    n2 += n7 - n6;
                    --n5;
                    continue;
                }
                break;
            }
        } else {
            int n8;
            int n9 = n2;
            int n10 = n2 + n5 - 16;
            while (n3 >= (n8 = this.f[n2])) {
                if (n3 == n8) {
                    return this.f[n10 + n2 - n9];
                }
                if (++n2 < n10) continue;
            }
        }
        return 0;
    }

    private String c(int n2, int n3) {
        char c2 = this.h.charAt(n2++);
        if (n3 < 0 || c2 <= n3) {
            throw new ck("Invalid property (value) name choice");
        }
        while (n3 > 0) {
            while ('\u0000' != this.h.charAt(n2++)) {
            }
            --n3;
        }
        int n4 = n2;
        while ('\u0000' != this.h.charAt(n2)) {
            ++n2;
        }
        if (n4 == n2) {
            return null;
        }
        return this.h.substring(n4, n2);
    }

    private static int b(int n2) {
        return 65 <= n2 && n2 <= 90 ? n2 + 32 : n2;
    }

    private boolean a(e e2, CharSequence charSequence) {
        i i2 = com.ibm.icu.util.i.b;
        for (int i3 = 0; i3 < charSequence.length(); ++i3) {
            int n2 = charSequence.charAt(i3);
            if (n2 == 45 || n2 == 95 || n2 == 32 || 9 <= n2 && n2 <= 13) continue;
            if (!i2.c()) {
                return false;
            }
            n2 = iq.b(n2);
            i2 = e2.b(n2);
        }
        return i2.b();
    }

    public String a(int n2, int n3) {
        int n4 = this.a(n2);
        if (n4 == 0) {
            throw new IllegalArgumentException("Invalid property enum " + n2 + " (0x" + Integer.toHexString(n2) + ")");
        }
        return this.c(this.f[n4], n3);
    }

    public String a(int n2, int n3, int n4) {
        int n5 = this.a(n2);
        if (n5 == 0) {
            throw new IllegalArgumentException("Invalid property enum " + n2 + " (0x" + Integer.toHexString(n2) + ")");
        }
        int n6 = this.b(this.f[n5 + 1], n3);
        if (n6 == 0) {
            throw new IllegalArgumentException("Property " + n2 + " (0x" + Integer.toHexString(n2) + ") does not have named values");
        }
        return this.c(n6, n4);
    }

    private int b(int n2, CharSequence charSequence) {
        e e2 = new e(this.g, n2);
        if (this.a(e2, charSequence)) {
            return e2.c();
        }
        return -1;
    }

    public int a(CharSequence charSequence) {
        return this.b(0, charSequence);
    }

    public int a(int n2, CharSequence charSequence) {
        int n3 = this.a(n2);
        if (n3 == 0) {
            throw new IllegalArgumentException("Invalid property enum " + n2 + " (0x" + Integer.toHexString(n2) + ")");
        }
        if ((n3 = this.f[n3 + 1]) == 0) {
            throw new IllegalArgumentException("Property " + n2 + " (0x" + Integer.toHexString(n2) + ") does not have named values");
        }
        return this.b(this.f[n3], charSequence);
    }

    public static int a(String string, String string2) {
        int n2 = 0;
        int n3 = 0;
        char c2 = '\u0000';
        char c3 = '\u0000';
        block6: while (true) {
            boolean bl2;
            if (n2 < string.length()) {
                c2 = string.charAt(n2);
                switch (c2) {
                    case '\t': 
                    case '\n': 
                    case '\u000b': 
                    case '\f': 
                    case '\r': 
                    case ' ': 
                    case '-': 
                    case '_': {
                        ++n2;
                        continue block6;
                    }
                }
            }
            block7: while (n3 < string2.length()) {
                c3 = string2.charAt(n3);
                switch (c3) {
                    case '\t': 
                    case '\n': 
                    case '\u000b': 
                    case '\f': 
                    case '\r': 
                    case ' ': 
                    case '-': 
                    case '_': {
                        ++n3;
                        continue block7;
                    }
                }
            }
            boolean bl3 = n2 == string.length();
            boolean bl4 = bl2 = n3 == string2.length();
            if (bl3) {
                if (bl2) {
                    return 0;
                }
                c2 = '\u0000';
            } else if (bl2) {
                c3 = '\u0000';
            }
            int n4 = iq.b(c2) - iq.b(c3);
            if (n4 != 0) {
                return n4;
            }
            ++n2;
            ++n3;
        }
    }

    static {
        try {
            a = new iq();
        }
        catch (IOException iOException) {
            MissingResourceException missingResourceException = new MissingResourceException("Could not construct UPropertyAliases. Missing pnames.icu", "", "");
            missingResourceException.initCause(iOException);
            throw missingResourceException;
        }
    }
}

