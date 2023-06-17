/*
 * Decompiled with CFR 0.150.
 */
public class aym
extends bwr {
    private final String a;

    public aym(String string) {
        this.a = string;
    }

    public String a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.a;
    }

    public aym c() {
        aym aym2 = new aym(this.a);
        aym2.a(this.h().l());
        for (cbg cbg2 : this.g()) {
            aym2.a(cbg2.f());
        }
        return aym2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof aym) {
            aym aym2 = (aym)object;
            return this.a.equals(aym2.a()) && super.equals(object);
        }
        return false;
    }

    @Override
    public String toString() {
        return "TextComponent{text='" + this.a + '\'' + ", siblings=" + this.c + ", style=" + this.h() + '}';
    }

    @Override
    public /* synthetic */ cbg f() {
        return this.c();
    }
}

