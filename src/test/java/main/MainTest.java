package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    static int NOTUSED = 0;
    static int AND = 1;
    static int OR = 2;


    @Test
    void endToEnd1() {
        LIC.LENGTH1 = 2;
        LIC.RADIUS1 = 4;
        LIC.EPSILON = 0.2;
        LIC.AREA1 = 4;
        LIC.Q_PTS = 2;
        LIC.QUADS = 4;
        LIC.DIST = 3.5;
        LIC.N_PTS = 4;
        LIC.K_PTS = 1;
        LIC.A_PTS = 2;
        LIC.B_PTS = 4;
        LIC.C_PTS = 1;
        LIC.D_PTS = 1;
        LIC.E_PTS = 2;
        LIC.F_PTS = 1;
        LIC.G_PTS = 1;
        LIC.LENGTH2 = 2.4;
        LIC.RADIUS2 = 1.75;
        LIC.AREA2 = 3.45;

        Main.PUV = new boolean[]{true, false, true, false, true, true, false, true, false, false, true, true, false,
                false, true};


        Main.POINTS = new Point[]{
                new Point(8.65,-1.21),
                new Point(8.88,-2.33),
                new Point(-7.02,0.71),
                new Point(-4.40,-9.63),
                new Point(8.10,-9.92),
                new Point(8.31,-9.74),
                new Point(-0.42,1.65),
                new Point(1.87,-3.23),
                new Point(-6.01,-4.24),
                new Point(8.79,-3.73),
                new Point(2.57,8.89),
                new Point(-5.98,4.66),
                new Point(8.30,3.23),
                new Point(-2.93,2.66),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
                new Point(8.65,-1.21),
                new Point(8.88,-2.33),
                new Point(-7.02,0.71),
                new Point(-4.40,-9.63),
                new Point(8.10,-9.92),
                new Point(8.31,-9.74),
                new Point(-0.42,1.65),
                new Point(1.87,-3.23),
                new Point(-6.01,-4.24),
                new Point(8.79,-3.73),
                new Point(2.57,8.89),
                new Point(-5.98,4.66),
                new Point(8.30,3.23),
                new Point(-2.93,2.66),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
                new Point(8.65,-1.21),
                new Point(8.88,-2.33),
                new Point(-7.02,0.71),
                new Point(-4.40,-9.63),
                new Point(8.10,-9.92),
                new Point(8.31,-9.74),
                new Point(-0.42,1.65),
                new Point(1.87,-3.23),
                new Point(-6.01,-4.24),
                new Point(8.79,-3.73),
                new Point(2.57,8.89),
                new Point(-5.98,4.66),
                new Point(8.30,3.23),
                new Point(-2.93,2.66),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
                new Point(8.65,-1.21),
                new Point(8.88,-2.33),
                new Point(-7.02,0.71),
                new Point(-4.40,-9.63),
                new Point(8.10,-9.92),
                new Point(8.31,-9.74),
                new Point(-0.42,1.65),
                new Point(1.87,-3.23),
                new Point(-6.01,-4.24),
                new Point(8.79,-3.73),
                new Point(2.57,8.89),
                new Point(-5.98,4.66),
                new Point(8.30,3.23),
                new Point(-2.93,2.66),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
                new Point(8.65,-1.21),
                new Point(8.88,-2.33),
                new Point(-7.02,0.71),
                new Point(-4.40,-9.63),
                new Point(8.10,-9.92),
                new Point(8.31,-9.74),
                new Point(-0.42,1.65),
                new Point(1.87,-3.23),
                new Point(-6.01,-4.24),
                new Point(8.79,-3.73),
                new Point(2.57,8.89),
                new Point(-5.98,4.66),
                new Point(8.30,3.23),
                new Point(-2.93,2.66),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
        };
        Main.LCM = new int[][]
                {
                        {AND, AND, OR, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED},
                        {AND, AND, OR, OR, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED},
                        {OR, OR, AND, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED},
                        {AND, OR, AND, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},

                };


        assertTrue(Main.decide());



    }

    //trivial due to only one puv being active, making only lic8 matter using points 26, 28 and 30 satisfies the
    // condition for lic 8 which means pum[8,0...14] is true except [8,8] which will make fuv8 true.
    @Test
    void endToEnd2() {
        LIC.LENGTH1 = 4.174158799179775;
        LIC.RADIUS1 = 1.09150482275528;
        LIC.EPSILON = 0.8580374729757092;
        LIC.AREA1 = 0.5059294394073188;
        LIC.Q_PTS = 2;
        LIC.QUADS = 3;
        LIC.DIST = 2.3210967023848257;
        LIC.N_PTS = 3;
        LIC.K_PTS = 1;
        LIC.A_PTS = 1;
        LIC.B_PTS = 1;
        LIC.C_PTS = 1;
        LIC.D_PTS = 1;
        LIC.E_PTS = 1;
        LIC.F_PTS = 1;
        LIC.G_PTS = 1;
        LIC.LENGTH2 = 2.7848092336776875;
        LIC.RADIUS2 = 2.907354456346098;
        LIC.AREA2 = 2.6089253774222225;

        Main.PUV = new boolean[]{false, false, false, false, false, false, false, false, true, false, false, false, false, false, false,};


        Main.POINTS = new Point[]{
                new Point(-0.4658969980293306, 0.7159759164652353),
                new Point(0.5423362497595956, -0.12814965149353408),
                new Point(0.9077313554097839, -0.6800705244114702),
                new Point(-0.47562432584344627, 0.06265540861119145),
                new Point(-0.9263679131899509, 0.37947377080884137),
                new Point(0.28717208756439794, -0.5963603131488462),
                new Point(0.7630995544769166, -0.5506616683645673),
                new Point(-0.8878269879870833, -0.2108865677622458),
                new Point(0.221215507333411, 0.8962556233988022),
                new Point(0.8695762291467135, -0.48095570662257314),
                new Point(-0.01617259329794396, -0.2733242476123523),
                new Point(0.8475832180739629, 0.47334531108627753),
                new Point(-0.7297025778837267, 0.14039477556442037),
                new Point(0.9360586710401699, -0.8390971271766974),
                new Point(0.05664921857751071, 0.5488221496749377),
                new Point(-0.7426512537907208, -0.17032157171542872),
                new Point(0.03200650713966291, 0.19786912656537115),
                new Point(-0.03535564100154054, 0.9697304321774147),
                new Point(-0.30002566353375015, 0.9537116473657068),
                new Point(0.645570938110269, 0.23624754610872367),
                new Point(0.7017546022896295, 0.2280878592487232),
                new Point(0.16854831949390658, 0.21661758628909356),
                new Point(-0.09359174991986308, 0.801787245552599),
                new Point(0.9389304150682425, -0.26944194312913594),
                new Point(0.2598553690947629, 0.22236282054741885),
                new Point(-0.26223117923633876, 0.06816495458809668),
                new Point(-0.7024190004588515, -0.07093002809243876),
                new Point(0.4489973705450039, -0.36580274883112174),
                new Point(0.9677304123520429, 0.6585420895131582),
                new Point(-0.3398778799325679, -0.37773592583002746),
                new Point(-0.9580526769748969, -0.3776404137904874),
                new Point(0.5808356479108661, 0.8335551596352839),
                new Point(0.2167512646012435, -0.6174183279703231),
                new Point(0.29134617568510235, 0.27342391448486913),
                new Point(0.14874350978069306, 0.19894945902540617),
                new Point(-0.2581373764614716, -0.430020277435214),
                new Point(-0.623460754711475, 0.17270893698952183),
                new Point(0.7380345439611578, 0.22347579257984784),
                new Point(0.8019463799201718, 0.8408670135833316),
                new Point(0.7654175222332273, 0.1513340050365397),
                new Point(-0.07455331500533058, 0.8690145494434278),
                new Point(0.00902379195925751, 0.8051653996077817),
                new Point(0.06650427140001369, 0.4039209671977886),
                new Point(-0.014411056327090055, -0.4044293175661069),
                new Point(0.765288858687794, -0.3871175778632585),
                new Point(0.018053966211116323, 0.8604716247938475),
                new Point(0.5292345066765203, 0.5106078851565978),
                new Point(0.9665962474670629, 0.977781651755131),
                new Point(-0.6220140980957982, 0.04482603826085363),
                new Point(0.1552560533898364, 0.5431845274226619),
                new Point(0.47365595197958354, -0.2737039583260956),
                new Point(-0.9573884650715889, 0.1684935057104786),
                new Point(-0.756358365230366, 0.2496866515572589),
                new Point(-0.2293688570718282, 0.3109920980970191),
                new Point(-0.1410371181500134, 0.16061017324281712),
                new Point(0.9858800945338317, -0.08968854585923691),
                new Point(0.15713677267423254, -0.380297519893543),
                new Point(-0.2918157976007383, 0.3083269741709067),
                new Point(-0.8521891662902257, -0.021246851435493097),
                new Point(0.9940586929448065, -0.44892315174063535),
                new Point(-0.3185014283357315, -0.27001666605159724),
                new Point(0.49293891113023247, -0.1998599940532313),
                new Point(0.5087484416369239, -0.5647607380189421),
                new Point(-0.8325767366590702, -0.0650984197905633),
                new Point(0.14353288706050926, -0.5683985900529009),
                new Point(0.5385687087575499, -0.7340165180684821),
                new Point(-0.4250646369167872, -0.9969246145300461),
                new Point(0.6674105123240819, 0.5496697722295134),
                new Point(-0.09083808257505832, 0.4724584421081435),
                new Point(-0.2951655566946927, 0.33240353000861367),
                new Point(-0.19751525944473958, -0.7035222252816273),
                new Point(0.09891661582154976, 0.7639227445702792),
                new Point(-0.9558099461239427, -0.26686063497661294),
                new Point(-0.37432073473718597, -0.6629322714222612),
                new Point(-0.2712975350953004, -0.7687756487220014),
                new Point(-0.9563443571874399, -0.8092166094777331),
                new Point(-0.9089349430294613, 0.23293764835926),
                new Point(-0.4503038543430906, -0.8797407430022142),
                new Point(0.10143539179583438, -0.2705266719318724),
                new Point(0.9712096808107067, -0.15501272852196402),
                new Point(-0.42604092777208713, 0.2144966661521519),
                new Point(0.9408873395203867, 0.1804249348212401),
                new Point(-0.1289693487638639, -0.11645445938150134),
                new Point(-0.34388838672752464, -0.6939828379045794),
                new Point(-0.6758459354976181, 0.6719341628768873),
                new Point(0.5377389583986738, -0.2722870130028747),
                new Point(0.7088779694005949, -0.092500815778507),
                new Point(0.6319214581346486, -0.12564456927271106),
                new Point(-0.9222365459791362, -0.9183185098311777),
                new Point(0.8473746365131198, -0.6126698767303762),
                new Point(0.8268435189932271, 0.05719968799587649),
                new Point(-0.6014390045393112, 0.3219759460710576),
                new Point(0.9685520175797766, -0.11967798297507604),
                new Point(0.041627689437483184, 0.7297805063476395),
                new Point(0.7378646509966069, -0.22087237535618587),
                new Point(-0.6108087940398033, 0.2595542358102647),
                new Point(0.8264553331317246, -0.4733615607803099),
                new Point(0.002986677176644026, -0.03690759914948716),
                new Point(0.9925672475217959, 0.6733704791975441),
                new Point(0.5139807966371506, -0.4526515151041357),
                 };
        Main.LCM = new int[][]
                {
                        {AND, AND, OR, NOTUSED, OR, AND, OR, NOTUSED, OR, NOTUSED, OR, AND, NOTUSED, OR, AND, },
                        {AND, NOTUSED, NOTUSED, AND, NOTUSED, AND, OR, OR, OR, NOTUSED, NOTUSED, NOTUSED, OR, NOTUSED, NOTUSED, },
                        {OR, NOTUSED, NOTUSED, AND, OR, AND, NOTUSED, AND, AND, OR, NOTUSED, AND, OR, NOTUSED, OR, },
                        {NOTUSED, AND, AND, NOTUSED, AND, AND, AND, NOTUSED, OR, NOTUSED, NOTUSED, AND, AND, OR, NOTUSED, },
                        {OR, NOTUSED, OR, AND, OR, OR, AND, NOTUSED, NOTUSED, NOTUSED, OR, AND, NOTUSED, NOTUSED, OR, },
                        {AND, AND, AND, AND, OR, NOTUSED, AND, NOTUSED, OR, OR, OR, AND, AND, AND, AND, },
                        {OR, OR, NOTUSED, AND, AND, AND, AND, OR, OR, AND, OR, NOTUSED, NOTUSED, NOTUSED, OR, },
                        {NOTUSED, OR, AND, NOTUSED, NOTUSED, NOTUSED, OR, NOTUSED, OR, OR, AND, OR, AND, NOTUSED, AND, },
                        {OR, OR, AND, OR, NOTUSED, OR, OR, OR, OR, OR, NOTUSED, AND, NOTUSED, NOTUSED, NOTUSED, },
                        {NOTUSED, NOTUSED, OR, NOTUSED, NOTUSED, OR, AND, OR, OR, NOTUSED, AND, AND, NOTUSED, NOTUSED, NOTUSED, },
                        {OR, NOTUSED, NOTUSED, NOTUSED, OR, OR, OR, AND, NOTUSED, AND, NOTUSED, NOTUSED, OR, NOTUSED, OR, },
                        {AND, NOTUSED, AND, AND, AND, AND, NOTUSED, OR, AND, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, OR, },
                        {NOTUSED, OR, OR, AND, NOTUSED, AND, NOTUSED, AND, NOTUSED, NOTUSED, OR, NOTUSED, NOTUSED, OR, OR, },
                        {OR, NOTUSED, NOTUSED, OR, NOTUSED, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, OR, AND, OR, },
                        {AND, NOTUSED, OR, NOTUSED, OR, AND, OR, AND, NOTUSED, NOTUSED, OR, OR, OR, OR, NOTUSED, },


                };


        assertTrue(Main.decide());



    }


}