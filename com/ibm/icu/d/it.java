/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.a.ar;
import com.ibm.icu.a.t;
import com.ibm.icu.b.b;
import com.ibm.icu.d.cb;
import com.ibm.icu.d.eg;
import com.ibm.icu.d.hv;
import com.ibm.icu.d.hz;
import com.ibm.icu.d.jz;
import com.ibm.icu.d.kz;
import com.ibm.icu.d.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class it
extends u {
    public static final int g = 0;
    public static final int h = 100;
    public static final int i = 100;
    public static final int j = 200;
    public static final int k = 200;
    public static final int l = 300;
    public static final int m = 300;
    public static final int n = 400;
    public static final int o = 400;
    public static final int p = 500;
    private static final int s = 1;
    private static final int t = 0;
    private static final int u = 0;
    private static final int v = 1;
    private static final int w = 2;
    private CharacterIterator x = new StringCharacterIterator("");
    hv q;
    private int y;
    private boolean z = true;
    private int A = 0;
    private static final String B = "rbbi";
    private static final boolean C = ar.b("rbbi") && ar.c("rbbi").indexOf("trace") >= 0;
    private int D = 2;
    private final kz E = new kz();
    private int[] F;
    private int G;
    private boolean H = true;
    private final Set I = Collections.synchronizedSet(new HashSet());
    static final String r = ar.b("rbbi") ? ar.c("rbbi") : null;

    private it() {
        this.I.add(this.E);
    }

    public static it a(InputStream inputStream) {
        it it2 = new it();
        it2.q = hv.a(inputStream);
        return it2;
    }

    public it(String string) {
        this();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            it.a(string, byteArrayOutputStream);
            byte[] arrby = byteArrayOutputStream.toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
            this.q = hv.a(byteArrayInputStream);
        }
        catch (IOException iOException) {
            RuntimeException runtimeException = new RuntimeException("RuleBasedBreakIterator rule compilation internal error: " + iOException.getMessage());
            throw runtimeException;
        }
    }

    public Object clone() {
        it it2 = (it)super.clone();
        if (this.x != null) {
            it2.x = (CharacterIterator)this.x.clone();
        }
        return it2;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        try {
            it it2 = (it)object;
            if (this.q != it2.q && (this.q == null || it2.q == null)) {
                return false;
            }
            if (this.q != null && it2.q != null && !this.q.g.equals(it2.q.g)) {
                return false;
            }
            if (this.x == null && it2.x == null) {
                return true;
            }
            if (this.x == null || it2.x == null) {
                return false;
            }
            return this.x.equals(it2.x);
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public String toString() {
        String string = "";
        if (this.q != null) {
            string = this.q.g;
        }
        return string;
    }

    public int hashCode() {
        return this.q.g.hashCode();
    }

    public void n() {
        this.q.a();
    }

    public static void a(String string, OutputStream outputStream) {
        hz.a(string, outputStream);
    }

    public int a() {
        this.F = null;
        this.A = 0;
        this.G = 0;
        this.y = 0;
        this.z = true;
        if (this.x == null) {
            return -1;
        }
        this.x.first();
        return this.x.getIndex();
    }

    public int b() {
        this.F = null;
        this.A = 0;
        this.G = 0;
        if (this.x == null) {
            this.y = 0;
            this.z = true;
            return -1;
        }
        this.z = false;
        int n2 = this.x.getEndIndex();
        this.x.setIndex(n2);
        return n2;
    }

    public int a(int n2) {
        int n3 = this.e();
        while (n2 > 0) {
            n3 = this.s();
            --n2;
        }
        while (n2 < 0) {
            n3 = this.d();
            ++n2;
        }
        return n3;
    }

    public int c() {
        return this.s();
    }

    public int d() {
        int n2;
        CharacterIterator characterIterator = this.f();
        this.z = false;
        if (this.F != null && this.G > 0) {
            --this.G;
            characterIterator.setIndex(this.F[this.G]);
            return this.F[this.G];
        }
        this.F = null;
        int n3 = this.e();
        int n4 = this.q();
        if (n4 == -1) {
            return n4;
        }
        if (this.A == 0) {
            return n4;
        }
        if (this.F != null) {
            this.G = this.F.length - 2;
            return n4;
        }
        while (n4 < n3 && (n2 = this.s()) < n3) {
            n4 = n2;
        }
        if (this.F != null) {
            this.G = 0;
            while (this.G < this.F.length) {
                if (this.F[this.G] >= n3) {
                    --this.G;
                    break;
                }
                ++this.G;
            }
        }
        this.z = false;
        characterIterator.setIndex(n4);
        return n4;
    }

    private int q() {
        if (this.x == null || this.e() == this.x.getBeginIndex()) {
            this.y = 0;
            this.z = true;
            return -1;
        }
        if (this.q.e != null || this.q.d != null) {
            return this.b(this.q.c);
        }
        int n2 = this.e();
        com.ibm.icu.a.u.b(this.x);
        int n3 = this.b(this.q.c);
        if (n3 == -1) {
            n3 = this.x.getBeginIndex();
            this.x.setIndex(n3);
        }
        int n4 = n3;
        int n5 = 0;
        boolean bl2 = false;
        while ((n4 = this.s()) != -1 && n4 < n2) {
            n3 = n4;
            n5 = this.y;
            bl2 = true;
        }
        this.x.setIndex(n3);
        this.y = n5;
        this.z = bl2;
        return n3;
    }

    public int b(int n2) {
        CharacterIterator characterIterator = this.f();
        if (this.F == null || n2 < this.F[0] || n2 >= this.F[this.F.length - 1]) {
            this.F = null;
            return this.f(n2);
        }
        this.G = 0;
        while (this.G < this.F.length && n2 >= this.F[this.G]) {
            ++this.G;
        }
        characterIterator.setIndex(this.F[this.G]);
        return characterIterator.getIndex();
    }

    private int f(int n2) {
        this.y = 0;
        this.z = true;
        if (this.x == null || n2 >= this.x.getEndIndex()) {
            this.b();
            return this.c();
        }
        if (n2 < this.x.getBeginIndex()) {
            return this.a();
        }
        int n3 = 0;
        if (this.q.e != null) {
            this.x.setIndex(n2);
            com.ibm.icu.a.u.a(this.x);
            this.b(this.q.e);
            n3 = this.c();
            while (n3 <= n2) {
                n3 = this.c();
            }
            return n3;
        }
        if (this.q.d != null) {
            this.x.setIndex(n2);
            com.ibm.icu.a.u.b(this.x);
            this.a(this.q.d);
            int n4 = this.d();
            while (n4 > n2) {
                n3 = this.d();
                if (n3 <= n2) {
                    return n4;
                }
                n4 = n3;
            }
            n3 = this.c();
            if (n3 <= n2) {
                return this.c();
            }
            return n3;
        }
        this.x.setIndex(n2);
        if (n2 == this.x.getBeginIndex()) {
            return this.s();
        }
        n3 = this.d();
        while (n3 != -1 && n3 <= n2) {
            n3 = this.c();
        }
        return n3;
    }

    public int c(int n2) {
        CharacterIterator characterIterator = this.f();
        if (this.F == null || n2 <= this.F[0] || n2 > this.F[this.F.length - 1]) {
            this.F = null;
            return this.g(n2);
        }
        this.G = 0;
        while (this.G < this.F.length && n2 > this.F[this.G]) {
            ++this.G;
        }
        --this.G;
        characterIterator.setIndex(this.F[this.G]);
        return characterIterator.getIndex();
    }

    private int g(int n2) {
        if (this.x == null || n2 > this.x.getEndIndex()) {
            return this.b();
        }
        if (n2 < this.x.getBeginIndex()) {
            return this.a();
        }
        if (this.q.d != null) {
            this.x.setIndex(n2);
            com.ibm.icu.a.u.b(this.x);
            this.a(this.q.d);
            int n3 = this.d();
            while (n3 >= n2) {
                n3 = this.d();
            }
            return n3;
        }
        if (this.q.e != null) {
            int n4;
            this.x.setIndex(n2);
            com.ibm.icu.a.u.a(this.x);
            this.b(this.q.e);
            int n5 = this.c();
            while (n5 < n2) {
                n4 = this.c();
                if (n4 >= n2) {
                    return n5;
                }
                n5 = n4;
            }
            n4 = this.d();
            if (n4 >= n2) {
                return this.d();
            }
            return n4;
        }
        this.x.setIndex(n2);
        return this.d();
    }

    protected static final void a(int n2, CharacterIterator characterIterator) {
        if (n2 < characterIterator.getBeginIndex() || n2 > characterIterator.getEndIndex()) {
            throw new IllegalArgumentException("offset out of bounds");
        }
    }

    public boolean d(int n2) {
        it.a(n2, this.x);
        if (n2 == this.x.getBeginIndex()) {
            this.a();
            return true;
        }
        if (n2 == this.x.getEndIndex()) {
            this.b();
            return true;
        }
        this.x.setIndex(n2);
        com.ibm.icu.a.u.b(this.x);
        int n3 = this.x.getIndex();
        boolean bl2 = this.b(n3) == n2;
        return bl2;
    }

    public int e() {
        return this.x != null ? this.x.getIndex() : -1;
    }

    private void r() {
        if (!this.z) {
            int n2 = this.e();
            if (n2 == -1 || n2 == this.x.getBeginIndex()) {
                this.y = 0;
                this.z = true;
            } else {
                int n3 = this.x.getIndex();
                this.a();
                int n4 = this.e();
                while (this.x.getIndex() < n3) {
                    n4 = this.c();
                }
                com.ibm.icu.a.a.a(n3 == n4);
            }
            com.ibm.icu.a.a.a(this.z);
            com.ibm.icu.a.a.a(this.y >= 0 && this.y < this.q.h.length);
        }
    }

    public int o() {
        this.r();
        int n2 = this.y + this.q.h[this.y];
        int n3 = this.q.h[n2];
        return n3;
    }

    public int a(int[] arrn) {
        this.r();
        int n2 = this.q.h[this.y];
        if (arrn != null) {
            int n3 = Math.min(n2, arrn.length);
            for (int i2 = 0; i2 < n3; ++i2) {
                arrn[i2] = this.q.h[this.y + i2 + 1];
            }
        }
        return n2;
    }

    public CharacterIterator f() {
        return this.x;
    }

    public void a(CharacterIterator characterIterator) {
        this.x = characterIterator;
        int n2 = this.a();
        if (characterIterator != null) {
            this.H = (this.D == 1 || this.D == 2) && characterIterator.getEndIndex() != n2;
        }
    }

    void e(int n2) {
        this.D = n2;
        if (n2 != 1 && n2 != 2) {
            this.H = false;
        }
    }

    int p() {
        return this.D;
    }

    private eg h(int n2) {
        eg eg22;
        if (n2 == Integer.MAX_VALUE || !this.H) {
            return null;
        }
        for (eg eg22 : this.I) {
            if (!eg22.a(n2, this.D)) continue;
            return eg22;
        }
        int n3 = com.ibm.icu.b.b.e(n2, 4106);
        eg22 = null;
        try {
            switch (n3) {
                case 38: {
                    eg22 = new jz();
                    break;
                }
                case 17: 
                case 20: 
                case 22: {
                    if (this.p() == 1) {
                        eg22 = new cb(false);
                        break;
                    }
                    this.E.b(n2, this.p());
                    eg22 = this.E;
                    break;
                }
                case 18: {
                    if (this.p() == 1) {
                        eg22 = new cb(true);
                        break;
                    }
                    this.E.b(n2, this.p());
                    eg22 = this.E;
                    break;
                }
                default: {
                    this.E.b(n2, this.p());
                    eg22 = this.E;
                    break;
                }
            }
        }
        catch (IOException iOException) {
            eg22 = null;
        }
        if (eg22 != null) {
            this.I.add(eg22);
        }
        return eg22;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int s() {
        if (this.F == null || this.G == this.F.length - 1) {
            int n2 = this.x.getIndex();
            this.A = 0;
            int n3 = this.a(this.q.b);
            if (this.A > 1 && n3 - n2 > 1) {
                this.x.setIndex(n2);
                eg eg2 = this.h(com.ibm.icu.a.u.c(this.x));
                if (eg2 == null) {
                    this.x.setIndex(n3);
                    return n3;
                }
                Stack stack = new Stack();
                eg2.a(this.x, n2, n3, false, this.p(), stack);
                int n4 = stack.size();
                this.F = new int[n4 + 2];
                this.F[0] = n2;
                for (int i2 = 0; i2 < n4; ++i2) {
                    this.F[i2 + 1] = (Integer)stack.elementAt(i2);
                }
                this.F[n4 + 1] = n3;
                this.G = 0;
            } else {
                this.F = null;
                return n3;
            }
        }
        if (this.F != null) {
            ++this.G;
            this.x.setIndex(this.F[this.G]);
            return this.F[this.G];
        }
        com.ibm.icu.a.a.a(false);
        return -1;
    }

    private int a(short[] arrs) {
        int n2;
        if (C) {
            System.out.println("Handle Next   pos      char  state category");
        }
        this.z = true;
        this.y = 0;
        CharacterIterator characterIterator = this.x;
        t t2 = this.q.f;
        int n3 = characterIterator.current();
        if (n3 >= 55296 && (n3 = com.ibm.icu.a.u.a(characterIterator, n3)) == Integer.MAX_VALUE) {
            return -1;
        }
        int n4 = n2 = characterIterator.getIndex();
        int n5 = 1;
        int n6 = this.q.a(n5);
        int n7 = 3;
        short s2 = arrs[5];
        int n8 = 1;
        if ((s2 & 2) != 0) {
            n7 = 2;
            n8 = 0;
            if (C) {
                System.out.print("            " + hv.a(characterIterator.getIndex(), 5));
                System.out.print(hv.b(n3, 10));
                System.out.println(hv.a(n5, 7) + hv.a(n7, 6));
            }
        }
        short s3 = 0;
        int n9 = 0;
        int n10 = 0;
        while (n5 != 0) {
            if (n3 == Integer.MAX_VALUE) {
                if (n8 == 2) {
                    if (n10 <= n4) break;
                    n4 = n10;
                    this.y = n9;
                    break;
                }
                n8 = 2;
                n7 = 1;
            } else if (n8 == 1) {
                n7 = (short)t2.a(n3);
                if ((n7 & 0x4000) != 0) {
                    ++this.A;
                    n7 = (short)(n7 & 0xFFFFBFFF);
                }
                if (C) {
                    System.out.print("            " + hv.a(characterIterator.getIndex(), 5));
                    System.out.print(hv.b(n3, 10));
                    System.out.println(hv.a(n5, 7) + hv.a(n7, 6));
                }
                if ((n3 = (int)characterIterator.next()) >= 55296) {
                    n3 = com.ibm.icu.a.u.a(characterIterator, n3);
                }
            } else {
                n8 = 1;
            }
            n5 = arrs[n6 + 4 + n7];
            n6 = this.q.a(n5);
            if (arrs[n6 + 0] == -1) {
                n4 = characterIterator.getIndex();
                if (n3 >= 65536 && n3 <= 0x10FFFF) {
                    --n4;
                }
                this.y = arrs[n6 + 2];
            }
            if (arrs[n6 + 1] != 0) {
                if (s3 != 0 && arrs[n6 + 0] == s3) {
                    n4 = n10;
                    this.y = n9;
                    s3 = 0;
                    if ((s2 & 1) == 0) continue;
                    characterIterator.setIndex(n4);
                    return n4;
                }
                n10 = characterIterator.getIndex();
                if (n3 >= 65536 && n3 <= 0x10FFFF) {
                    --n10;
                }
                s3 = arrs[n6 + 1];
                n9 = arrs[n6 + 2];
                continue;
            }
            if (arrs[n6 + 0] == 0) continue;
            s3 = 0;
        }
        if (n4 == n2) {
            if (C) {
                System.out.println("Iterator did not move. Advancing by 1.");
            }
            characterIterator.setIndex(n2);
            com.ibm.icu.a.u.a(characterIterator);
            n4 = characterIterator.getIndex();
        } else {
            characterIterator.setIndex(n4);
        }
        if (C) {
            System.out.println("result = " + n4);
        }
        return n4;
    }

    private int b(short[] arrs) {
        if (this.x == null || arrs == null) {
            return 0;
        }
        int n2 = 0;
        short s2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        boolean bl2 = (arrs[5] & 1) != 0;
        this.z = false;
        this.y = 0;
        n3 = n4 = this.x.getIndex();
        int n6 = com.ibm.icu.a.u.b(this.x);
        int n7 = 1;
        int n8 = this.q.a(n7);
        n2 = 3;
        int n9 = 1;
        if ((arrs[5] & 2) != 0) {
            n2 = 2;
            n9 = 0;
        }
        if (C) {
            System.out.println("Handle Prev   pos   char  state category ");
        }
        while (true) {
            if (n6 == Integer.MAX_VALUE) {
                if (n9 == 2 || this.q.a.b == 1) {
                    if (n5 < n3) {
                        n3 = n5;
                        s2 = 0;
                        break;
                    }
                    if (n3 != n4) break;
                    this.x.setIndex(n4);
                    com.ibm.icu.a.u.b(this.x);
                    break;
                }
                n9 = 2;
                n2 = 1;
            }
            if (n9 == 1 && ((n2 = (int)((short)this.q.f.a(n6))) & 0x4000) != 0) {
                ++this.A;
                n2 &= 0xFFFFBFFF;
            }
            if (C) {
                System.out.print("             " + this.x.getIndex() + "   ");
                if (32 <= n6 && n6 < 127) {
                    System.out.print("  " + n6 + "  ");
                } else {
                    System.out.print(" " + Integer.toHexString(n6) + " ");
                }
                System.out.println(" " + n7 + "  " + n2 + " ");
            }
            if (arrs[(n8 = this.q.a(n7 = arrs[n8 + 4 + n2])) + 0] == -1) {
                n3 = this.x.getIndex();
            }
            if (arrs[n8 + 1] != 0) {
                if (s2 != 0 && arrs[n8 + 0] == s2) {
                    n3 = n5;
                    s2 = 0;
                    if (bl2) {
                        break;
                    }
                } else {
                    n5 = this.x.getIndex();
                    s2 = arrs[n8 + 1];
                }
            } else if (arrs[n8 + 0] != 0 && !bl2) {
                s2 = 0;
            }
            if (n7 == 0) break;
            if (n9 == 1) {
                n6 = com.ibm.icu.a.u.b(this.x);
                continue;
            }
            if (n9 != 0) continue;
            n9 = 1;
        }
        if (n3 == n4) {
            n3 = this.x.setIndex(n4);
            com.ibm.icu.a.u.b(this.x);
            n3 = this.x.getIndex();
        }
        this.x.setIndex(n3);
        if (C) {
            System.out.println("Result = " + n3);
        }
        return n3;
    }
}

