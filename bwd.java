/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.Iterator;

class bwd
implements Iterable {
    private final Class a;
    private final Iterable[] b;

    private bwd(Class class_, Iterable[] arriterable) {
        this.a = class_;
        this.b = arriterable;
    }

    public Iterator iterator() {
        if (this.b.length <= 0) {
            return Collections.singletonList(atc.a(this.a, 0)).iterator();
        }
        return new gp(this.a, this.b, null);
    }

    /* synthetic */ bwd(Class class_, Iterable[] arriterable, csf csf2) {
        this(class_, arriterable);
    }
}

