/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fo;
import com.ibm.icu.d.gk;
import com.ibm.icu.d.gm;
import com.ibm.icu.d.lf;
import com.ibm.icu.d.lm;
import java.io.IOException;

public class dy
extends gm {
    private gm a;
    private lf b;

    public dy(gm gm2, lf lf2) {
        this.a = gm2;
        this.b = lf2;
    }

    public StringBuilder a(CharSequence charSequence, StringBuilder stringBuilder) {
        if (stringBuilder == charSequence) {
            throw new IllegalArgumentException();
        }
        stringBuilder.setLength(0);
        this.a(charSequence, stringBuilder, lm.c);
        return stringBuilder;
    }

    public Appendable a(CharSequence charSequence, Appendable appendable) {
        if (appendable == charSequence) {
            throw new IllegalArgumentException();
        }
        return this.a(charSequence, appendable, lm.c);
    }

    public StringBuilder a(StringBuilder stringBuilder, CharSequence charSequence) {
        return this.a(stringBuilder, charSequence, true);
    }

    public StringBuilder b(StringBuilder stringBuilder, CharSequence charSequence) {
        return this.a(stringBuilder, charSequence, false);
    }

    public String d_(int n2) {
        return this.b.b(n2) ? this.a.d_(n2) : null;
    }

    public String e(int n2) {
        return this.b.b(n2) ? this.a.e(n2) : null;
    }

    public int a(int n2, int n3) {
        return this.b.b(n2) && this.b.b(n3) ? this.a.a(n2, n3) : -1;
    }

    public int f(int n2) {
        return this.b.b(n2) ? this.a.f(n2) : 0;
    }

    public boolean a(CharSequence charSequence) {
        lm lm2 = lm.c;
        int n2 = 0;
        while (n2 < charSequence.length()) {
            int n3 = this.b.a(charSequence, n2, lm2);
            if (lm2 == lm.a) {
                lm2 = lm.c;
            } else {
                if (!this.a.a(charSequence.subSequence(n2, n3))) {
                    return false;
                }
                lm2 = lm.a;
            }
            n2 = n3;
        }
        return true;
    }

    public gk b(CharSequence charSequence) {
        gk gk2 = fo.q;
        lm lm2 = lm.c;
        int n2 = 0;
        while (n2 < charSequence.length()) {
            int n3 = this.b.a(charSequence, n2, lm2);
            if (lm2 == lm.a) {
                lm2 = lm.c;
            } else {
                gk gk3 = this.a.b(charSequence.subSequence(n2, n3));
                if (gk3 == fo.p) {
                    return gk3;
                }
                if (gk3 == fo.r) {
                    gk2 = gk3;
                }
                lm2 = lm.a;
            }
            n2 = n3;
        }
        return gk2;
    }

    public int c(CharSequence charSequence) {
        lm lm2 = lm.c;
        int n2 = 0;
        while (n2 < charSequence.length()) {
            int n3 = this.b.a(charSequence, n2, lm2);
            if (lm2 == lm.a) {
                lm2 = lm.c;
            } else {
                int n4 = n2 + this.a.c(charSequence.subSequence(n2, n3));
                if (n4 < n3) {
                    return n4;
                }
                lm2 = lm.a;
            }
            n2 = n3;
        }
        return charSequence.length();
    }

    public boolean b(int n2) {
        return !this.b.b(n2) || this.a.b(n2);
    }

    public boolean c(int n2) {
        return !this.b.b(n2) || this.a.c(n2);
    }

    public boolean d(int n2) {
        return !this.b.b(n2) || this.a.d(n2);
    }

    private Appendable a(CharSequence charSequence, Appendable appendable, lm lm2) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            int n2 = 0;
            while (n2 < charSequence.length()) {
                int n3 = this.b.a(charSequence, n2, lm2);
                int n4 = n3 - n2;
                if (lm2 == lm.a) {
                    if (n4 != 0) {
                        appendable.append(charSequence, n2, n3);
                    }
                    lm2 = lm.c;
                } else {
                    if (n4 != 0) {
                        appendable.append(this.a.a(charSequence.subSequence(n2, n3), stringBuilder));
                    }
                    lm2 = lm.a;
                }
                n2 = n3;
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        return appendable;
    }

    private StringBuilder a(StringBuilder stringBuilder, CharSequence charSequence, boolean bl2) {
        CharSequence charSequence2;
        if (stringBuilder == charSequence) {
            throw new IllegalArgumentException();
        }
        if (stringBuilder.length() == 0) {
            if (bl2) {
                return this.a(charSequence, stringBuilder);
            }
            return stringBuilder.append(charSequence);
        }
        int n2 = this.b.a(charSequence, 0, lm.c);
        if (n2 != 0) {
            charSequence2 = charSequence.subSequence(0, n2);
            int n3 = this.b.b((CharSequence)stringBuilder, Integer.MAX_VALUE, lm.c);
            if (n3 == 0) {
                if (bl2) {
                    this.a.a(stringBuilder, charSequence2);
                } else {
                    this.a.b(stringBuilder, charSequence2);
                }
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.subSequence(n3, stringBuilder.length()));
                if (bl2) {
                    this.a.a(stringBuilder2, charSequence2);
                } else {
                    this.a.b(stringBuilder2, charSequence2);
                }
                stringBuilder.delete(n3, Integer.MAX_VALUE).append((CharSequence)stringBuilder2);
            }
        }
        if (n2 < charSequence.length()) {
            charSequence2 = charSequence.subSequence(n2, charSequence.length());
            if (bl2) {
                this.a(charSequence2, stringBuilder, lm.a);
            } else {
                stringBuilder.append(charSequence2);
            }
        }
        return stringBuilder;
    }
}

