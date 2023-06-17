/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.agi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

class gp
extends agi {
    private int a = -2;
    private final Iterable[] b;
    private final Iterator[] c;
    private final Object[] d;

    private gp(Class class_, Iterable[] arriterable) {
        this.b = arriterable;
        this.c = (Iterator[])atc.a(Iterator.class, this.b.length);
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.c[i2] = arriterable[i2].iterator();
        }
        this.d = atc.a(class_, this.c.length);
    }

    private void b() {
        this.a = -1;
        Arrays.fill(this.c, null);
        Arrays.fill(this.d, null);
    }

    @Override
    public boolean hasNext() {
        if (this.a == -2) {
            this.a = 0;
            for (Iterator iterator : this.c) {
                if (iterator.hasNext()) continue;
                this.b();
                break;
            }
            return true;
        }
        if (this.a >= this.c.length) {
            Iterator iterator;
            this.a = this.c.length - 1;
            while (this.a >= 0 && !(iterator = this.c[this.a]).hasNext()) {
                if (this.a == 0) {
                    this.b();
                    break;
                }
                this.c[this.a] = iterator = this.b[this.a].iterator();
                if (!iterator.hasNext()) {
                    this.b();
                    break;
                }
                --this.a;
            }
        }
        return this.a >= 0;
    }

    public Object[] a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        while (this.a < this.c.length) {
            this.d[this.a] = this.c[this.a].next();
            ++this.a;
        }
        return (Object[])this.d.clone();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ gp(Class class_, Iterable[] arriterable, csf csf2) {
        this(class_, arriterable);
    }
}

