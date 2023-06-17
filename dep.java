/*
 * Decompiled with CFR 0.150.
 */
final class dep
implements cmi {
    dep() {
    }

    @Override
    public int a(bhl bhl2, int n2) {
        qb qb2 = (qb)vb.a.get(clx.h(bhl2));
        if (qb2 == null) {
            return -1;
        }
        return n2 == 0 ? qb2.b : qb2.c;
    }
}

