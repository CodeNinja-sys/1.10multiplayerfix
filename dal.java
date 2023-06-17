/*
 * Decompiled with CFR 0.150.
 */
public class dal
extends cjn {
    @Override
    public void cH_() {
        this.y.clear();
        this.y.add(new bcy(0, this.w / 2 - 155, this.x / 4 + 120 + 12, bf.a("gui.toTitle", new Object[0])));
        this.y.add(new bcy(1, this.w / 2 - 155 + 160, this.x / 4 + 120 + 12, bf.a("menu.quit", new Object[0])));
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == 0) {
            this.u.a(new agj());
        } else if (cwv2.j == 1) {
            this.u.p();
        }
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, "Out of memory!", this.w / 2, this.x / 4 - 60 + 20, 0xFFFFFF);
        this.b(this.B, "Minecraft has run out of memory.", this.w / 2 - 140, this.x / 4 - 60 + 60 + 0, 0xA0A0A0);
        this.b(this.B, "This could be caused by a bug in the game or by the", this.w / 2 - 140, this.x / 4 - 60 + 60 + 18, 0xA0A0A0);
        this.b(this.B, "Java Virtual Machine not being allocated enough", this.w / 2 - 140, this.x / 4 - 60 + 60 + 27, 0xA0A0A0);
        this.b(this.B, "memory.", this.w / 2 - 140, this.x / 4 - 60 + 60 + 36, 0xA0A0A0);
        this.b(this.B, "To prevent level corruption, the current game has quit.", this.w / 2 - 140, this.x / 4 - 60 + 60 + 54, 0xA0A0A0);
        this.b(this.B, "We've tried to free up enough memory to let you go back to", this.w / 2 - 140, this.x / 4 - 60 + 60 + 63, 0xA0A0A0);
        this.b(this.B, "the main menu and back to playing, but this may not have worked.", this.w / 2 - 140, this.x / 4 - 60 + 60 + 72, 0xA0A0A0);
        this.b(this.B, "Please restart the game if you see this message again.", this.w / 2 - 140, this.x / 4 - 60 + 60 + 81, 0xA0A0A0);
        super.a(n2, n3, f2);
    }
}

