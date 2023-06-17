/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import java.io.File;
import java.util.ArrayList;
import org.apache.logging.log4j.core.a.c.a.a;
import org.apache.logging.log4j.core.a.c.a.b;
import org.apache.logging.log4j.core.a.c.a.e;
import org.apache.logging.log4j.core.a.c.a.f;
import org.apache.logging.log4j.core.a.c.p;
import org.apache.logging.log4j.core.a.c.q;
import org.apache.logging.log4j.core.a.c.s;
import org.apache.logging.log4j.core.d.n;
import org.apache.logging.log4j.d;

public class c
implements s {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    private static final int b = 1;
    private static final int c = 7;
    private final int d;
    private final int e;
    private final boolean f;
    private final org.apache.logging.log4j.core.h.n g;
    private final int h;

    protected c(int n2, int n3, boolean bl2, int n4, org.apache.logging.log4j.core.h.n n5) {
        this.e = n2;
        this.d = n3;
        this.f = bl2;
        this.h = n4;
        this.g = n5;
    }

    @Override
    public p a(org.apache.logging.log4j.core.a.c.f f2) {
        if (this.d >= 0) {
            String string;
            int n2 = this.a(this.e, this.d, f2);
            if (n2 < 0) {
                return null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            f2.p().a(this.g, stringBuilder, (Object)n2);
            String string2 = f2.f();
            String string3 = string = stringBuilder.toString();
            a a2 = null;
            if (string.endsWith(".gz")) {
                string = string.substring(0, string.length() - 3);
                a2 = new e(new File(string), new File(string3), true);
            } else if (string.endsWith(".zip")) {
                string = string.substring(0, string.length() - 4);
                a2 = new f(new File(string), new File(string3), true, this.h);
            }
            org.apache.logging.log4j.core.a.c.a.d d2 = new org.apache.logging.log4j.core.a.c.a.d(new File(string2), new File(string), false);
            return new q(string2, false, d2, a2);
        }
        return null;
    }

    private int a(int n2, int n3, org.apache.logging.log4j.core.a.c.f f2) {
        return this.f ? this.c(n2, n3, f2) : this.b(n2, n3, f2);
    }

    private int b(int n2, int n3, org.apache.logging.log4j.core.a.c.f f2) {
        Object object;
        int n4;
        int n5 = 0;
        ArrayList<org.apache.logging.log4j.core.a.c.a.d> arrayList = new ArrayList<org.apache.logging.log4j.core.a.c.a.d>();
        StringBuilder stringBuilder = new StringBuilder();
        f2.p().a(stringBuilder, (Object)n2);
        Object object2 = this.g.a(stringBuilder);
        if (((String)object2).endsWith(".gz")) {
            n5 = 3;
        } else if (((String)object2).endsWith(".zip")) {
            n5 = 4;
        }
        for (n4 = n2; n4 <= n3; ++n4) {
            Object object3;
            object = new File((String)object2);
            boolean bl2 = false;
            if (n5 > 0) {
                object3 = new File(((String)object2).substring(0, ((String)object2).length() - n5));
                if (((File)object).exists()) {
                    if (((File)object3).exists()) {
                        ((File)object3).delete();
                    }
                } else {
                    object = object3;
                    bl2 = true;
                }
            }
            if (!((File)object).exists()) break;
            if (n4 == n3) {
                if (((File)object).delete()) break;
                return -1;
            }
            stringBuilder.setLength(0);
            f2.p().a(stringBuilder, (Object)(n4 + 1));
            Object object4 = object3 = this.g.a(stringBuilder);
            if (bl2) {
                object4 = ((String)object3).substring(0, ((String)object3).length() - n5);
            }
            arrayList.add(new org.apache.logging.log4j.core.a.c.a.d((File)object, new File((String)object4), true));
            object2 = object3;
        }
        for (n4 = arrayList.size() - 1; n4 >= 0; --n4) {
            object = (b)arrayList.get(n4);
            try {
                if (object.a()) continue;
                return -1;
            }
            catch (Exception exception) {
                a.f("Exception during purge in RollingFileAppender", (Throwable)exception);
                return -1;
            }
        }
        return n2;
    }

    private int c(int n2, int n3, org.apache.logging.log4j.core.a.c.f f2) {
        Object object;
        int n4;
        int n5 = 0;
        ArrayList<org.apache.logging.log4j.core.a.c.a.d> arrayList = new ArrayList<org.apache.logging.log4j.core.a.c.a.d>();
        StringBuilder stringBuilder = new StringBuilder();
        f2.p().a(stringBuilder, (Object)n3);
        Object object2 = this.g.a(stringBuilder);
        if (((String)object2).endsWith(".gz")) {
            n5 = 3;
        } else if (((String)object2).endsWith(".zip")) {
            n5 = 4;
        }
        int n6 = 0;
        for (n4 = n3; n4 >= n2; --n4) {
            Object object3;
            object = new File((String)object2);
            if (n4 == n3 && ((File)object).exists()) {
                n6 = n3;
            } else if (n6 == 0 && ((File)object).exists()) {
                n6 = n4 + 1;
                break;
            }
            boolean bl2 = false;
            if (n5 > 0) {
                object3 = new File(((String)object2).substring(0, ((String)object2).length() - n5));
                if (((File)object).exists()) {
                    if (((File)object3).exists()) {
                        ((File)object3).delete();
                    }
                } else {
                    object = object3;
                    bl2 = true;
                }
            }
            if (((File)object).exists()) {
                if (n4 == n2) {
                    if (((File)object).delete()) break;
                    return -1;
                }
                stringBuilder.setLength(0);
                f2.p().a(stringBuilder, (Object)(n4 - 1));
                Object object4 = object3 = this.g.a(stringBuilder);
                if (bl2) {
                    object4 = ((String)object3).substring(0, ((String)object3).length() - n5);
                }
                arrayList.add(new org.apache.logging.log4j.core.a.c.a.d((File)object, new File((String)object4), true));
                object2 = object3;
                continue;
            }
            stringBuilder.setLength(0);
            f2.p().a(stringBuilder, (Object)(n4 - 1));
            object2 = this.g.a(stringBuilder);
        }
        if (n6 == 0) {
            n6 = n2;
        }
        for (n4 = arrayList.size() - 1; n4 >= 0; --n4) {
            object = (b)arrayList.get(n4);
            try {
                if (object.a()) continue;
                return -1;
            }
            catch (Exception exception) {
                a.f("Exception during purge in RollingFileAppender", (Throwable)exception);
                return -1;
            }
        }
        return n6;
    }

    public String toString() {
        return "DefaultRolloverStrategy(min=" + this.e + ", max=" + this.d + ")";
    }

    public static c a(String string, String string2, String string3, String string4, org.apache.logging.log4j.core.config.d d2) {
        int n2;
        int n3;
        boolean bl2;
        boolean bl3 = bl2 = string3 == null ? true : string3.equalsIgnoreCase("max");
        if (string2 != null) {
            n3 = Integer.parseInt(string2);
            if (n3 < 1) {
                a.b("Minimum window size too small. Limited to 1");
                n3 = 1;
            }
        } else {
            n3 = 1;
        }
        if (string != null) {
            n2 = Integer.parseInt(string);
            if (n2 < n3) {
                n2 = n3 < 7 ? 7 : n3;
                a.b("Maximum window size must be greater than the minimum windows size. Set to " + n2);
            }
        } else {
            n2 = 7;
        }
        int n4 = n.a(string4, -1);
        return new c(n3, n2, bl2, n4, d2.l());
    }
}

