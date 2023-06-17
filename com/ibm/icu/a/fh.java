/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.fd;
import com.ibm.icu.a.fe;
import com.ibm.icu.a.ff;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class fh {
    private char[] b;
    private List c;
    private List d;
    final /* synthetic */ fd a;

    private fh(fd fd2) {
        this.a = fd2;
    }

    private fh(fd fd2, char[] arrc, List list, List list2) {
        this.a = fd2;
        this.b = arrc;
        this.c = list;
        this.d = list2;
    }

    public Iterator a() {
        if (this.c == null) {
            return null;
        }
        return this.c.iterator();
    }

    public void a(ff ff2, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        while (ff2.hasNext()) {
            stringBuilder.append(ff2.a());
        }
        this.a(fd.a(stringBuilder), 0, object);
    }

    public fh a(ff ff2) {
        if (this.d == null) {
            return null;
        }
        if (!ff2.hasNext()) {
            return null;
        }
        fh fh2 = null;
        Character c2 = ff2.a();
        for (fh fh3 : this.d) {
            if (c2.charValue() < fh3.b[0]) break;
            if (c2.charValue() != fh3.b[0]) continue;
            if (!fh3.b(ff2)) break;
            fh2 = fh3;
            break;
        }
        return fh2;
    }

    private void a(char[] arrc, int n2, Object object) {
        if (arrc.length == n2) {
            this.c = this.a(this.c, object);
            return;
        }
        if (this.d == null) {
            this.d = new LinkedList();
            fh fh2 = new fh(this.a, fd.a(arrc, n2), this.a((List)null, object), null);
            this.d.add(fh2);
            return;
        }
        ListIterator<fh> listIterator = this.d.listIterator();
        while (listIterator.hasNext()) {
            fh fh3 = (fh)listIterator.next();
            if (arrc[n2] < fh3.b[0]) {
                listIterator.previous();
                break;
            }
            if (arrc[n2] != fh3.b[0]) continue;
            int n3 = fh3.a(arrc, n2);
            if (n3 == fh3.b.length) {
                fh3.a(arrc, n2 + n3, object);
            } else {
                fh3.a(n3);
                fh3.a(arrc, n2 + n3, object);
            }
            return;
        }
        listIterator.add(new fh(this.a, fd.a(arrc, n2), this.a((List)null, object), null));
    }

    private boolean b(ff ff2) {
        boolean bl2 = true;
        for (int i2 = 1; i2 < this.b.length; ++i2) {
            if (!ff2.hasNext()) {
                bl2 = false;
                break;
            }
            Character c2 = ff2.a();
            if (c2.charValue() == this.b[i2]) continue;
            bl2 = false;
            break;
        }
        return bl2;
    }

    private int a(char[] arrc, int n2) {
        int n3;
        int n4 = arrc.length - n2;
        int n5 = this.b.length < n4 ? this.b.length : n4;
        for (n3 = 0; n3 < n5 && this.b[n3] == arrc[n2 + n3]; ++n3) {
        }
        return n3;
    }

    private void a(int n2) {
        char[] arrc = fd.a(this.b, n2);
        this.b = fd.a(this.b, 0, n2);
        fh fh2 = new fh(this.a, arrc, this.c, this.d);
        this.c = null;
        this.d = new LinkedList();
        this.d.add(fh2);
    }

    private List a(List linkedList, Object object) {
        if (linkedList == null) {
            linkedList = new LinkedList<Object>();
        }
        linkedList.add(object);
        return linkedList;
    }

    /* synthetic */ fh(fd fd2, fe fe2) {
        this(fd2);
    }
}

