/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import com.a.a.d.agi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.minecraft.u.b.i;

class l
extends agi {
    private int a = -2;
    private final Iterable[] b;
    private final Iterator[] c;
    private final Object[] d;

    private l(Class class_, Iterable[] arriterable) {
        this.b = arriterable;
        this.c = (Iterator[])i.a(Iterator.class, this.b.length);
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.c[i2] = arriterable[i2].iterator();
        }
        this.d = i.a(class_, this.c.length);
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
            Iterator[] arriterator = this.c;
            int n2 = this.c.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Iterator iterator = arriterator[i2];
                if (iterator.hasNext()) continue;
                this.b();
                break;
            }
            return true;
        }
        if (this.a >= this.c.length) {
            this.a = this.c.length - 1;
            while (this.a >= 0) {
                Iterator iterator = this.c[this.a];
                if (iterator.hasNext()) break;
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Object[] a() {
        if (this.hasNext()) ** GOTO lbl5
        throw new NoSuchElementException();
lbl-1000:
        // 1 sources

        {
            this.d[this.a] = this.c[this.a].next();
            ++this.a;
lbl5:
            // 2 sources

            ** while (this.a < this.c.length)
        }
lbl6:
        // 1 sources

        return (Object[])this.d.clone();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ l(Class class_, Iterable[] arriterable, l l2) {
        this(class_, arriterable);
    }
}

