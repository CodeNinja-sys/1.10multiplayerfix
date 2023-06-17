/*
 * Decompiled with CFR 0.150.
 */
public class avy
extends bwr {
    private final String a;

    public avy(String string) {
        this.a = string;
    }

    public String a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.a;
    }

    public avy c() {
        avy avy2 = new avy(this.a);
        avy2.a(this.h().l());
        for (cbg cbg2 : this.g()) {
            avy2.a(cbg2.f());
        }
        return avy2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof avy) {
            avy avy2 = (avy)object;
            return this.a.equals(avy2.a) && super.equals(object);
        }
        return false;
    }

    @Override
    public String toString() {
        return "SelectorComponent{pattern='" + this.a + '\'' + ", siblings=" + this.c + ", style=" + this.h() + '}';
    }

    @Override
    public /* synthetic */ cbg f() {
        return this.c();
    }
}

