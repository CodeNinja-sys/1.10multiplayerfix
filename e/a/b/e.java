/*
 * Decompiled with CFR 0.150.
 */
package e.a.b;

import e.a.b.c;
import e.a.b.d;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class e {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static int e = 1;
    public static int f = 1;
    public static int g = 1;
    public static int h = 1;
    public static int i = 2;
    public static int j = 2;
    public static int k = 3;
    public Mixer.Info l = null;
    public int m = 0;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public int u = -1;
    public int v = -1;
    public int w = 0;

    public e() {
    }

    public e(Mixer.Info info, int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8) {
        this.l = info;
        this.m = n2;
        this.n = bl2;
        this.o = bl3;
        this.p = bl4;
        this.q = bl5;
        this.r = bl6;
        this.s = bl7;
        this.t = bl8;
    }

    public void a(Mixer.Info info) {
        SourceDataLine[] arrsourceDataLine;
        int n2;
        int n3;
        int n4;
        DataLine.Info info2;
        AudioFormat audioFormat;
        Mixer mixer;
        if (info == null) {
            throw new d("No Mixer info specified in method 'MixerRanking.rank'", this);
        }
        this.l = info;
        try {
            mixer = AudioSystem.getMixer(this.l);
        }
        catch (Exception exception) {
            throw new d("Unable to acquire the specified Mixer in method 'MixerRanking.rank'", this);
        }
        if (mixer == null) {
            throw new d("Unable to acquire the specified Mixer in method 'MixerRanking.rank'", this);
        }
        this.n = true;
        try {
            audioFormat = new AudioFormat(e.a.b.c.a(false, 0), 16, 2, true, false);
            info2 = new DataLine.Info(SourceDataLine.class, audioFormat);
        }
        catch (Exception exception) {
            throw new d("Invalid minimum sample-rate specified in method 'MixerRanking.rank'", this);
        }
        if (!AudioSystem.isLineSupported(info2)) {
            if (f == 1) {
                throw new d("Specified minimum sample-rate not possible for Mixer '" + this.l.getName() + "'", this);
            }
        } else {
            this.o = true;
        }
        try {
            audioFormat = new AudioFormat(e.a.b.c.b(false, 0), 16, 2, true, false);
            info2 = new DataLine.Info(SourceDataLine.class, audioFormat);
        }
        catch (Exception exception) {
            throw new d("Invalid maximum sample-rate specified in method 'MixerRanking.rank'", this);
        }
        if (!AudioSystem.isLineSupported(info2)) {
            if (g == 1) {
                throw new d("Specified maximum sample-rate not possible for Mixer '" + this.l.getName() + "'", this);
            }
        } else {
            this.p = true;
        }
        if (this.o) {
            this.u = e.a.b.c.a(false, 0);
        } else {
            n4 = e.a.b.c.a(false, 0);
            n3 = e.a.b.c.b(false, 0);
            while (n3 - n4 > 1) {
                n2 = n4 + (n3 - n4) / 2;
                audioFormat = new AudioFormat(n2, 16, 2, true, false);
                info2 = new DataLine.Info(SourceDataLine.class, audioFormat);
                if (AudioSystem.isLineSupported(info2)) {
                    this.u = n2;
                    n3 = n2;
                    continue;
                }
                n4 = n2;
            }
        }
        if (this.p) {
            this.v = e.a.b.c.b(false, 0);
        } else if (this.u != -1) {
            n3 = e.a.b.c.b(false, 0);
            n4 = this.u;
            while (n3 - n4 > 1) {
                n2 = n4 + (n3 - n4) / 2;
                audioFormat = new AudioFormat(n2, 16, 2, true, false);
                info2 = new DataLine.Info(SourceDataLine.class, audioFormat);
                if (AudioSystem.isLineSupported(info2)) {
                    this.v = n2;
                    n4 = n2;
                    continue;
                }
                n3 = n2;
            }
        }
        if (this.u == -1 || this.v == -1) {
            throw new d("No possible sample-rate found for Mixer '" + this.l.getName() + "'", this);
        }
        audioFormat = new AudioFormat(this.u, 16, 2, true, false);
        Clip clip = null;
        try {
            arrsourceDataLine = new DataLine.Info(Clip.class, audioFormat);
            clip = (Clip)mixer.getLine((Line.Info)arrsourceDataLine);
            byte[] arrby = new byte[10];
            clip.open(audioFormat, arrby, 0, arrby.length);
        }
        catch (Exception exception) {
            throw new d("Unable to attach an actual audio buffer to an actual Clip... Mixer '" + this.l.getName() + "' is unuseable.", this);
        }
        this.w = 1;
        info2 = new DataLine.Info(SourceDataLine.class, audioFormat);
        arrsourceDataLine = new SourceDataLine[e.a.b.c.c(false, 0) - 1];
        boolean bl2 = false;
        for (int i2 = 1; i2 < arrsourceDataLine.length + 1; ++i2) {
            try {
                arrsourceDataLine[i2 - 1] = (SourceDataLine)mixer.getLine(info2);
            }
            catch (Exception exception) {
                if (i2 == 0) {
                    throw new d("No output lines possible for Mixer '" + this.l.getName() + "'", this);
                }
                if (h != 1) break;
                throw new d("Specified maximum number of lines not possible for Mixer '" + this.l.getName() + "'", this);
            }
            this.w = i2 + 1;
        }
        try {
            clip.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
        clip = null;
        if (this.w == e.a.b.c.c(false, 0)) {
            this.q = true;
        }
        if (!e.a.b.c.a(false, false)) {
            i = 4;
        } else if (!arrsourceDataLine[0].isControlSupported(FloatControl.Type.MASTER_GAIN)) {
            if (i == 1) {
                throw new d("Gain control not available for Mixer '" + this.l.getName() + "'", this);
            }
        } else {
            this.r = true;
        }
        if (!e.a.b.c.b(false, false)) {
            j = 4;
        } else if (!arrsourceDataLine[0].isControlSupported(FloatControl.Type.PAN)) {
            if (j == 1) {
                throw new d("Pan control not available for Mixer '" + this.l.getName() + "'", this);
            }
        } else {
            this.s = true;
        }
        if (!e.a.b.c.c(false, false)) {
            k = 4;
        } else if (!arrsourceDataLine[0].isControlSupported(FloatControl.Type.SAMPLE_RATE)) {
            if (k == 1) {
                throw new d("Sample-rate control not available for Mixer '" + this.l.getName() + "'", this);
            }
        } else {
            this.t = true;
        }
        this.m += this.a(this.n, e);
        this.m += this.a(this.o, f);
        this.m += this.a(this.p, g);
        this.m += this.a(this.q, h);
        this.m += this.a(this.r, i);
        this.m += this.a(this.s, j);
        this.m += this.a(this.t, k);
        mixer = null;
        audioFormat = null;
        info2 = null;
        arrsourceDataLine = null;
    }

    private int a(boolean bl2, int n2) {
        if (bl2) {
            return 2;
        }
        if (n2 == 4) {
            return 2;
        }
        if (n2 == 3) {
            return 1;
        }
        return 0;
    }
}

