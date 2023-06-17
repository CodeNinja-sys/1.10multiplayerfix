/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.aq;
import a.a.a.a.c.as;
import a.a.a.a.c.at;
import a.a.a.a.c.au;
import a.a.a.a.c.av;

public class ar {
    public static final as a = new as();

    private ar() {
    }

    public static aq a() {
        return a;
    }

    public static aq a(Object object) {
        return new at(object);
    }

    public static aq a(aq aq2) {
        return new au(aq2);
    }

    public static aq a(aq aq2, Object object) {
        return new au(aq2, object);
    }

    public static aq b(aq aq2) {
        return new av(aq2);
    }
}

