/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.d;

import com.a.b.b.u;
import com.a.b.d.b;
import com.a.b.d.d;
import com.a.b.d.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class a
implements Closeable {
    private static final char[] a = ")]}'\n".toCharArray();
    private static final long b = -922337203685477580L;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final int g = 4;
    private static final int h = 5;
    private static final int i = 6;
    private static final int j = 7;
    private static final int k = 8;
    private static final int l = 9;
    private static final int m = 10;
    private static final int n = 11;
    private static final int o = 12;
    private static final int p = 13;
    private static final int q = 14;
    private static final int r = 15;
    private static final int s = 16;
    private static final int t = 17;
    private static final int u = 0;
    private static final int v = 1;
    private static final int w = 2;
    private static final int x = 3;
    private static final int y = 4;
    private static final int z = 5;
    private static final int A = 6;
    private static final int B = 7;
    private final Reader C;
    private boolean D = false;
    private final char[] E = new char[1024];
    private int F = 0;
    private int G = 0;
    private int H = 0;
    private int I = 0;
    private int J = 0;
    private long K;
    private int L;
    private String M;
    private int[] N = new int[32];
    private int O = 0;

    public a(Reader reader) {
        this.N[this.O++] = 6;
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.C = reader;
    }

    public final void a(boolean bl2) {
        this.D = bl2;
    }

    public final boolean p() {
        return this.D;
    }

    public void a() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 != 3) {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
        }
        this.a(1);
        this.J = 0;
    }

    public void b() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 == 4) {
            --this.O;
        } else {
            throw new IllegalStateException("Expected END_ARRAY but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
        }
        this.J = 0;
    }

    public void c() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 != 1) {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
        }
        this.a(3);
        this.J = 0;
    }

    public void d() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 == 2) {
            --this.O;
        } else {
            throw new IllegalStateException("Expected END_OBJECT but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
        }
        this.J = 0;
    }

    public boolean e() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        return n2 != 2 && n2 != 4;
    }

    public d f() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        switch (n2) {
            case 1: {
                return com.a.b.d.d.c;
            }
            case 2: {
                return com.a.b.d.d.d;
            }
            case 3: {
                return com.a.b.d.d.a;
            }
            case 4: {
                return com.a.b.d.d.b;
            }
            case 12: 
            case 13: 
            case 14: {
                return com.a.b.d.d.e;
            }
            case 5: 
            case 6: {
                return com.a.b.d.d.h;
            }
            case 7: {
                return com.a.b.d.d.i;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return com.a.b.d.d.f;
            }
            case 15: 
            case 16: {
                return com.a.b.d.d.g;
            }
            case 17: {
                return com.a.b.d.d.j;
            }
        }
        throw new AssertionError();
    }

    private int o() {
        int n2;
        int n3;
        int n4;
        block47: {
            block49: {
                block48: {
                    block46: {
                        n4 = this.N[this.O - 1];
                        if (n4 != 1) break block46;
                        this.N[this.O - 1] = 2;
                        break block47;
                    }
                    if (n4 != 2) break block48;
                    n3 = this.b(true);
                    switch (n3) {
                        case 93: {
                            this.J = 4;
                            return 4;
                        }
                        case 59: {
                            this.w();
                        }
                        case 44: {
                            break;
                        }
                        default: {
                            throw this.b("Unterminated array");
                        }
                    }
                    break block47;
                }
                if (n4 == 3 || n4 == 5) {
                    int n5;
                    this.N[this.O - 1] = 4;
                    if (n4 == 5) {
                        n5 = this.b(true);
                        switch (n5) {
                            case 125: {
                                this.J = 2;
                                return 2;
                            }
                            case 59: {
                                this.w();
                            }
                            case 44: {
                                break;
                            }
                            default: {
                                throw this.b("Unterminated object");
                            }
                        }
                    }
                    n5 = this.b(true);
                    switch (n5) {
                        case 34: {
                            this.J = 13;
                            return 13;
                        }
                        case 39: {
                            this.w();
                            this.J = 12;
                            return 12;
                        }
                        case 125: {
                            if (n4 != 5) {
                                this.J = 2;
                                return 2;
                            }
                            throw this.b("Expected name");
                        }
                    }
                    this.w();
                    --this.F;
                    if (this.a((char)n5)) {
                        this.J = 14;
                        return 14;
                    }
                    throw this.b("Expected name");
                }
                if (n4 != 4) break block49;
                this.N[this.O - 1] = 5;
                n3 = this.b(true);
                switch (n3) {
                    case 58: {
                        break;
                    }
                    case 61: {
                        this.w();
                        if ((this.F < this.G || this.b(1)) && this.E[this.F] == '>') {
                            ++this.F;
                            break;
                        }
                        break block47;
                    }
                    default: {
                        throw this.b("Expected ':'");
                    }
                }
                break block47;
            }
            if (n4 == 6) {
                if (this.D) {
                    this.z();
                }
                this.N[this.O - 1] = 7;
            } else if (n4 == 7) {
                n3 = this.b(false);
                if (n3 == -1) {
                    this.J = 17;
                    return 17;
                }
                this.w();
                --this.F;
            } else if (n4 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        n3 = this.b(true);
        switch (n3) {
            case 93: {
                if (n4 == 1) {
                    this.J = 4;
                    return 4;
                }
            }
            case 44: 
            case 59: {
                if (n4 == 1 || n4 == 2) {
                    this.w();
                    --this.F;
                    this.J = 7;
                    return 7;
                }
                throw this.b("Unexpected value");
            }
            case 39: {
                this.w();
                this.J = 8;
                return 8;
            }
            case 34: {
                if (this.O == 1) {
                    this.w();
                }
                this.J = 9;
                return 9;
            }
            case 91: {
                this.J = 3;
                return 3;
            }
            case 123: {
                this.J = 1;
                return 1;
            }
        }
        --this.F;
        if (this.O == 1) {
            this.w();
        }
        if ((n2 = this.q()) != 0) {
            return n2;
        }
        n2 = this.r();
        if (n2 != 0) {
            return n2;
        }
        if (!this.a(this.E[this.F])) {
            throw this.b("Expected value");
        }
        this.w();
        this.J = 10;
        return 10;
    }

    private int q() {
        int n2;
        String string;
        String string2;
        char c2 = this.E[this.F];
        if (c2 == 't' || c2 == 'T') {
            string2 = "true";
            string = "TRUE";
            n2 = 5;
        } else if (c2 == 'f' || c2 == 'F') {
            string2 = "false";
            string = "FALSE";
            n2 = 6;
        } else if (c2 == 'n' || c2 == 'N') {
            string2 = "null";
            string = "NULL";
            n2 = 7;
        } else {
            return 0;
        }
        int n3 = string2.length();
        for (int i2 = 1; i2 < n3; ++i2) {
            if (this.F + i2 >= this.G && !this.b(i2 + 1)) {
                return 0;
            }
            c2 = this.E[this.F + i2];
            if (c2 == string2.charAt(i2) || c2 == string.charAt(i2)) continue;
            return 0;
        }
        if ((this.F + n3 < this.G || this.b(n3 + 1)) && this.a(this.E[this.F + n3])) {
            return 0;
        }
        this.F += n3;
        this.J = n2;
        return this.J;
    }

    private int r() {
        char[] arrc = this.E;
        int n2 = this.F;
        int n3 = this.G;
        long l2 = 0L;
        boolean bl2 = false;
        boolean bl3 = true;
        int n4 = 0;
        int n5 = 0;
        block6: while (true) {
            if (n2 + n5 == n3) {
                if (n5 == arrc.length) {
                    return 0;
                }
                if (!this.b(n5 + 1)) break;
                n2 = this.F;
                n3 = this.G;
            }
            char c2 = arrc[n2 + n5];
            switch (c2) {
                case '-': {
                    if (n4 == 0) {
                        bl2 = true;
                        n4 = 1;
                        break;
                    }
                    if (n4 == 5) {
                        n4 = 6;
                        break;
                    }
                    return 0;
                }
                case '+': {
                    if (n4 == 5) {
                        n4 = 6;
                        break;
                    }
                    return 0;
                }
                case 'E': 
                case 'e': {
                    if (n4 == 2 || n4 == 4) {
                        n4 = 5;
                        break;
                    }
                    return 0;
                }
                case '.': {
                    if (n4 == 2) {
                        n4 = 3;
                        break;
                    }
                    return 0;
                }
                default: {
                    if (c2 < '0' || c2 > '9') {
                        if (!this.a(c2)) break block6;
                        return 0;
                    }
                    if (n4 == 1 || n4 == 0) {
                        l2 = -(c2 - 48);
                        n4 = 2;
                        break;
                    }
                    if (n4 == 2) {
                        if (l2 == 0L) {
                            return 0;
                        }
                        long l3 = l2 * 10L - (long)(c2 - 48);
                        bl3 &= l2 > -922337203685477580L || l2 == -922337203685477580L && l3 < l2;
                        l2 = l3;
                        break;
                    }
                    if (n4 == 3) {
                        n4 = 4;
                        break;
                    }
                    if (n4 != 5 && n4 != 6) break;
                    n4 = 7;
                }
            }
            ++n5;
        }
        if (n4 == 2 && bl3 && (l2 != Long.MIN_VALUE || bl2)) {
            this.K = bl2 ? l2 : -l2;
            this.F += n5;
            this.J = 15;
            return 15;
        }
        if (n4 == 2 || n4 == 4 || n4 == 7) {
            this.L = n5;
            this.J = 16;
            return 16;
        }
        return 0;
    }

    private boolean a(char c2) {
        switch (c2) {
            case '#': 
            case '/': 
            case ';': 
            case '=': 
            case '\\': {
                this.w();
            }
            case '\t': 
            case '\n': 
            case '\f': 
            case '\r': 
            case ' ': 
            case ',': 
            case ':': 
            case '[': 
            case ']': 
            case '{': 
            case '}': {
                return false;
            }
        }
        return true;
    }

    public String g() {
        String string;
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 == 14) {
            string = this.s();
        } else if (n2 == 12) {
            string = this.b('\'');
        } else if (n2 == 13) {
            string = this.b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
        }
        this.J = 0;
        return string;
    }

    public String h() {
        String string;
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 == 10) {
            string = this.s();
        } else if (n2 == 8) {
            string = this.b('\'');
        } else if (n2 == 9) {
            string = this.b('\"');
        } else if (n2 == 11) {
            string = this.M;
            this.M = null;
        } else if (n2 == 15) {
            string = Long.toString(this.K);
        } else if (n2 == 16) {
            string = new String(this.E, this.F, this.L);
            this.F += this.L;
        } else {
            throw new IllegalStateException("Expected a string but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
        }
        this.J = 0;
        return string;
    }

    public boolean i() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 == 5) {
            this.J = 0;
            return true;
        }
        if (n2 == 6) {
            this.J = 0;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
    }

    public void j() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 != 7) {
            throw new IllegalStateException("Expected null but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
        }
        this.J = 0;
    }

    public double k() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 == 15) {
            this.J = 0;
            return this.K;
        }
        if (n2 == 16) {
            this.M = new String(this.E, this.F, this.L);
            this.F += this.L;
        } else if (n2 == 8 || n2 == 9) {
            this.M = this.b(n2 == 8 ? (char)'\'' : '\"');
        } else if (n2 == 10) {
            this.M = this.s();
        } else if (n2 != 11) {
            throw new IllegalStateException("Expected a double but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
        }
        this.J = 11;
        double d2 = Double.parseDouble(this.M);
        if (!this.D && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new f("JSON forbids NaN and infinities: " + d2 + " at line " + this.u() + " column " + this.v());
        }
        this.M = null;
        this.J = 0;
        return d2;
    }

    public long l() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 == 15) {
            this.J = 0;
            return this.K;
        }
        if (n2 == 16) {
            this.M = new String(this.E, this.F, this.L);
            this.F += this.L;
        } else if (n2 == 8 || n2 == 9) {
            this.M = this.b(n2 == 8 ? (char)'\'' : '\"');
            try {
                long l2 = Long.parseLong(this.M);
                this.J = 0;
                return l2;
            }
            catch (NumberFormatException numberFormatException) {}
        } else {
            throw new IllegalStateException("Expected a long but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
        }
        this.J = 11;
        double d2 = Double.parseDouble(this.M);
        long l3 = (long)d2;
        if ((double)l3 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.M + " at line " + this.u() + " column " + this.v());
        }
        this.M = null;
        this.J = 0;
        return l3;
    }

    private String b(char c2) {
        char[] arrc = this.E;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            int n2 = this.F;
            int n3 = this.G;
            int n4 = n2;
            while (n2 < n3) {
                char c3;
                if ((c3 = arrc[n2++]) == c2) {
                    this.F = n2;
                    stringBuilder.append(arrc, n4, n2 - n4 - 1);
                    return stringBuilder.toString();
                }
                if (c3 == '\\') {
                    this.F = n2;
                    stringBuilder.append(arrc, n4, n2 - n4 - 1);
                    stringBuilder.append(this.y());
                    n2 = this.F;
                    n3 = this.G;
                    n4 = n2;
                    continue;
                }
                if (c3 != '\n') continue;
                ++this.H;
                this.I = n2;
            }
            stringBuilder.append(arrc, n4, n2 - n4);
            this.F = n2;
        } while (this.b(1));
        throw this.b("Unterminated string");
    }

    private String s() {
        String string;
        StringBuilder stringBuilder = null;
        int n2 = 0;
        block4: while (true) {
            if (this.F + n2 < this.G) {
                switch (this.E[this.F + n2]) {
                    case '#': 
                    case '/': 
                    case ';': 
                    case '=': 
                    case '\\': {
                        this.w();
                    }
                    case '\t': 
                    case '\n': 
                    case '\f': 
                    case '\r': 
                    case ' ': 
                    case ',': 
                    case ':': 
                    case '[': 
                    case ']': 
                    case '{': 
                    case '}': {
                        break block4;
                    }
                    default: {
                        ++n2;
                        break;
                    }
                }
                continue;
            }
            if (n2 < this.E.length) {
                if (!this.b(n2 + 1)) break;
                continue;
            }
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder();
            }
            stringBuilder.append(this.E, this.F, n2);
            this.F += n2;
            n2 = 0;
            if (!this.b(1)) break;
        }
        if (stringBuilder == null) {
            string = new String(this.E, this.F, n2);
        } else {
            stringBuilder.append(this.E, this.F, n2);
            string = stringBuilder.toString();
        }
        this.F += n2;
        return string;
    }

    private void c(char c2) {
        char[] arrc = this.E;
        do {
            int n2 = this.F;
            int n3 = this.G;
            while (n2 < n3) {
                char c3;
                if ((c3 = arrc[n2++]) == c2) {
                    this.F = n2;
                    return;
                }
                if (c3 == '\\') {
                    this.F = n2;
                    this.y();
                    n2 = this.F;
                    n3 = this.G;
                    continue;
                }
                if (c3 != '\n') continue;
                ++this.H;
                this.I = n2;
            }
            this.F = n2;
        } while (this.b(1));
        throw this.b("Unterminated string");
    }

    private void t() {
        do {
            int n2 = 0;
            while (this.F + n2 < this.G) {
                switch (this.E[this.F + n2]) {
                    case '#': 
                    case '/': 
                    case ';': 
                    case '=': 
                    case '\\': {
                        this.w();
                    }
                    case '\t': 
                    case '\n': 
                    case '\f': 
                    case '\r': 
                    case ' ': 
                    case ',': 
                    case ':': 
                    case '[': 
                    case ']': 
                    case '{': 
                    case '}': {
                        this.F += n2;
                        return;
                    }
                }
                ++n2;
            }
            this.F += n2;
        } while (this.b(1));
    }

    public int m() {
        int n2 = this.J;
        if (n2 == 0) {
            n2 = this.o();
        }
        if (n2 == 15) {
            int n3 = (int)this.K;
            if (this.K != (long)n3) {
                throw new NumberFormatException("Expected an int but was " + this.K + " at line " + this.u() + " column " + this.v());
            }
            this.J = 0;
            return n3;
        }
        if (n2 == 16) {
            this.M = new String(this.E, this.F, this.L);
            this.F += this.L;
        } else if (n2 == 8 || n2 == 9) {
            this.M = this.b(n2 == 8 ? (char)'\'' : '\"');
            try {
                int n4 = Integer.parseInt(this.M);
                this.J = 0;
                return n4;
            }
            catch (NumberFormatException numberFormatException) {}
        } else {
            throw new IllegalStateException("Expected an int but was " + (Object)((Object)this.f()) + " at line " + this.u() + " column " + this.v());
        }
        this.J = 11;
        double d2 = Double.parseDouble(this.M);
        int n5 = (int)d2;
        if ((double)n5 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.M + " at line " + this.u() + " column " + this.v());
        }
        this.M = null;
        this.J = 0;
        return n5;
    }

    public void close() {
        this.J = 0;
        this.N[0] = 8;
        this.O = 1;
        this.C.close();
    }

    public void n() {
        int n2 = 0;
        do {
            int n3;
            if ((n3 = this.J) == 0) {
                n3 = this.o();
            }
            if (n3 == 3) {
                this.a(1);
                ++n2;
            } else if (n3 == 1) {
                this.a(3);
                ++n2;
            } else if (n3 == 4) {
                --this.O;
                --n2;
            } else if (n3 == 2) {
                --this.O;
                --n2;
            } else if (n3 == 14 || n3 == 10) {
                this.t();
            } else if (n3 == 8 || n3 == 12) {
                this.c('\'');
            } else if (n3 == 9 || n3 == 13) {
                this.c('\"');
            } else if (n3 == 16) {
                this.F += this.L;
            }
            this.J = 0;
        } while (n2 != 0);
    }

    private void a(int n2) {
        if (this.O == this.N.length) {
            int[] arrn = new int[this.O * 2];
            System.arraycopy(this.N, 0, arrn, 0, this.O);
            this.N = arrn;
        }
        this.N[this.O++] = n2;
    }

    private boolean b(int n2) {
        int n3;
        char[] arrc = this.E;
        this.I -= this.F;
        if (this.G != this.F) {
            this.G -= this.F;
            System.arraycopy(arrc, this.F, arrc, 0, this.G);
        } else {
            this.G = 0;
        }
        this.F = 0;
        while ((n3 = this.C.read(arrc, this.G, arrc.length - this.G)) != -1) {
            this.G += n3;
            if (this.H == 0 && this.I == 0 && this.G > 0 && arrc[0] == '\ufeff') {
                ++this.F;
                ++this.I;
                ++n2;
            }
            if (this.G < n2) continue;
            return true;
        }
        return false;
    }

    private int u() {
        return this.H + 1;
    }

    private int v() {
        return this.F - this.I + 1;
    }

    private int b(boolean bl2) {
        block12: {
            char c2;
            char[] arrc = this.E;
            int n2 = this.F;
            int n3 = this.G;
            block4: while (true) {
                if (n2 == n3) {
                    this.F = n2;
                    if (!this.b(1)) break block12;
                    n2 = this.F;
                    n3 = this.G;
                }
                if ((c2 = arrc[n2++]) == '\n') {
                    ++this.H;
                    this.I = n2;
                    continue;
                }
                if (c2 == ' ' || c2 == '\r' || c2 == '\t') continue;
                if (c2 == '/') {
                    char c3;
                    this.F = n2;
                    if (n2 == n3) {
                        --this.F;
                        c3 = (char)(this.b(2) ? 1 : 0);
                        ++this.F;
                        if (c3 == '\u0000') {
                            return c2;
                        }
                    }
                    this.w();
                    c3 = arrc[this.F];
                    switch (c3) {
                        case '*': {
                            ++this.F;
                            if (!this.a("*/")) {
                                throw this.b("Unterminated comment");
                            }
                            n2 = this.F + 2;
                            n3 = this.G;
                            continue block4;
                        }
                        case '/': {
                            ++this.F;
                            this.x();
                            n2 = this.F;
                            n3 = this.G;
                            continue block4;
                        }
                    }
                    return c2;
                }
                if (c2 != '#') break;
                this.F = n2;
                this.w();
                this.x();
                n2 = this.F;
                n3 = this.G;
            }
            this.F = n2;
            return c2;
        }
        if (bl2) {
            throw new EOFException("End of input at line " + this.u() + " column " + this.v());
        }
        return -1;
    }

    private void w() {
        if (!this.D) {
            throw this.b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void x() {
        while (this.F < this.G || this.b(1)) {
            char c2;
            if ((c2 = this.E[this.F++]) == '\n') {
                ++this.H;
                this.I = this.F;
                break;
            }
            if (c2 != '\r') continue;
            break;
        }
    }

    private boolean a(String string) {
        while (this.F + string.length() <= this.G || this.b(string.length())) {
            block5: {
                if (this.E[this.F] == '\n') {
                    ++this.H;
                    this.I = this.F + 1;
                } else {
                    for (int i2 = 0; i2 < string.length(); ++i2) {
                        if (this.E[this.F + i2] == string.charAt(i2)) {
                            continue;
                        }
                        break block5;
                    }
                    return true;
                }
            }
            ++this.F;
        }
        return false;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " at line " + this.u() + " column " + this.v();
    }

    private char y() {
        if (this.F == this.G && !this.b(1)) {
            throw this.b("Unterminated escape sequence");
        }
        char c2 = this.E[this.F++];
        switch (c2) {
            case 'u': {
                int n2;
                if (this.F + 4 > this.G && !this.b(4)) {
                    throw this.b("Unterminated escape sequence");
                }
                char c3 = '\u0000';
                int n3 = n2 + 4;
                for (n2 = this.F; n2 < n3; ++n2) {
                    char c4 = this.E[n2];
                    c3 = (char)(c3 << 4);
                    if (c4 >= '0' && c4 <= '9') {
                        c3 = (char)(c3 + (c4 - 48));
                        continue;
                    }
                    if (c4 >= 'a' && c4 <= 'f') {
                        c3 = (char)(c3 + (c4 - 97 + 10));
                        continue;
                    }
                    if (c4 >= 'A' && c4 <= 'F') {
                        c3 = (char)(c3 + (c4 - 65 + 10));
                        continue;
                    }
                    throw new NumberFormatException("\\u" + new String(this.E, this.F, 4));
                }
                this.F += 4;
                return c3;
            }
            case 't': {
                return '\t';
            }
            case 'b': {
                return '\b';
            }
            case 'n': {
                return '\n';
            }
            case 'r': {
                return '\r';
            }
            case 'f': {
                return '\f';
            }
            case '\n': {
                ++this.H;
                this.I = this.F;
            }
        }
        return c2;
    }

    private IOException b(String string) {
        throw new f(string + " at line " + this.u() + " column " + this.v());
    }

    private void z() {
        this.b(true);
        --this.F;
        if (this.F + a.length > this.G && !this.b(a.length)) {
            return;
        }
        for (int i2 = 0; i2 < a.length; ++i2) {
            if (this.E[this.F + i2] == a[i2]) continue;
            return;
        }
        this.F += a.length;
    }

    static /* synthetic */ int a(a a2) {
        return a2.J;
    }

    static /* synthetic */ int b(a a2) {
        return a2.o();
    }

    static /* synthetic */ int a(a a2, int n2) {
        a2.J = n2;
        return a2.J;
    }

    static /* synthetic */ int c(a a2) {
        return a2.u();
    }

    static /* synthetic */ int d(a a2) {
        return a2.v();
    }

    static {
        com.a.b.b.u.a = new b();
    }
}

