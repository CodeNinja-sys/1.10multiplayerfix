/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.bc;
import com.ibm.icu.util.bd;
import com.ibm.icu.util.be;
import com.ibm.icu.util.dn;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ba {
    private final be a;
    private static ba b = new ba(be.a);
    private static bc c = new bc(null);

    public static ba a(dn dn2) {
        return c.a(dn2);
    }

    public static ba a(Locale locale) {
        return ba.a(dn.a(locale));
    }

    public bd a(bd ... arrbd) {
        return this.a(Arrays.asList(arrbd));
    }

    public bd a(List list) {
        if (list.size() == 0) {
            return bd.c;
        }
        if (list.size() == 1) {
            return (bd)((Object)list.get(0));
        }
        switch (this.a) {
            case a: {
                return bd.c;
            }
            case b: {
                boolean bl2 = false;
                boolean bl3 = false;
                for (bd bd2 : list) {
                    switch (bd2) {
                        case b: {
                            if (bl3) {
                                return bd.c;
                            }
                            bl2 = true;
                            break;
                        }
                        case a: {
                            if (bl2) {
                                return bd.c;
                            }
                            bl3 = true;
                            break;
                        }
                        case c: {
                            return bd.c;
                        }
                    }
                }
                return bl3 ? bd.a : bd.b;
            }
            case c: {
                for (bd bd3 : list) {
                    if (bd3 == bd.b) continue;
                    return bd.a;
                }
                return bd.b;
            }
        }
        return bd.c;
    }

    public ba(be be2) {
        this.a = be2;
    }

    static /* synthetic */ ba a() {
        return b;
    }
}

