/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;

class awr
implements Iterable {
    public static final dbk a = blg.a.s();
    final cpv b = new cpv(16);
    private int c;

    private awr() {
    }

    public int a(dbk dbk2) {
        int n2 = this.b.a(dbk2);
        if (n2 == -1) {
            n2 = this.c++;
            this.b.a(dbk2, n2);
        }
        return n2;
    }

    public dbk a(int n2) {
        dbk dbk2 = (dbk)this.b.a(n2);
        return dbk2 == null ? a : dbk2;
    }

    public Iterator iterator() {
        return this.b.iterator();
    }

    public void a(dbk dbk2, int n2) {
        this.b.a(dbk2, n2);
    }

    /* synthetic */ awr(zp zp2) {
        this();
    }
}

