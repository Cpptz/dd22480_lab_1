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

    //trivial
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

    // non trivial
    @Test
    void endToEnd3() {
        LIC.LENGTH1 = 1.240856201826821;
        LIC.RADIUS1 = 4.390333392734221;
        LIC.EPSILON = 1.1467062234301022;
        LIC.AREA1 = 3.618270456529948;
        LIC.Q_PTS = 2;
        LIC.QUADS = 1;
        LIC.DIST = 2.9960825843342995;
        LIC.N_PTS = 3;
        LIC.K_PTS = 1;
        LIC.A_PTS = 2;
        LIC.B_PTS = 2;
        LIC.C_PTS = 1;
        LIC.D_PTS = 2;
        LIC.E_PTS = 3;
        LIC.F_PTS = 4;
        LIC.G_PTS = 3;
        LIC.LENGTH2 = 3.59789303508143;
        LIC.RADIUS2 = 2.53146413667152;
        LIC.AREA2 = 4.624283353098858;

        Main.PUV = new boolean[]{false, true, true, false, false, false, true, false, true, true, false, false, true, false, true};


        Main.POINTS = new Point[]{
                new Point(71.58151580366189, 80.60666242190436),
                new Point(-42.216639009837145, -11.369165576244995),
                new Point(-92.60044298031637, 98.59971146819518),
                new Point(-8.400959690913126, -93.56369488983438),
                new Point(-37.92902093818664, -48.000840004664205),
                new Point(45.681500615500056, -15.120396331659933),
                new Point(-70.60258211121224, 21.54932296415339),
                new Point(-84.92240613142319, 52.49401234461516),
                new Point(-72.60171978327449, 64.38273721366852),
                new Point(-41.69499941285726, -7.1563605681500775),
                new Point(-67.25267683126263, 40.60232923532922),
                new Point(66.24275318765311, -89.74659454102694),
                new Point(-42.3455365488959, -59.95329007937724),
                new Point(-65.80315923096818, 93.89448793653804),
                new Point(-87.27631305371628, -84.39075397899333),
                new Point(64.95348419179746, -16.816057723323908),
                new Point(-3.0296707304783013, 70.71773065839139),
                new Point(-38.814689492276685, 9.49274785129785),
                new Point(99.75956624663243, 13.331193421710253),
                new Point(77.96245069207583, -72.33594779435947),
                new Point(32.821776983828215, -80.73712680571191),
                new Point(-84.91659458197867, 64.31152779435769),
                new Point(33.57516720215287, -14.889215415758116),
                new Point(-92.37458545472744, 19.999997219668415),
                new Point(-1.3156455470946753, 88.58782122834847),
                new Point(43.301408781499276, -90.79795465745461),
                new Point(61.67817954732914, 11.424319622339652),
                new Point(95.79013585730368, 10.970522429496029),
                new Point(-52.28427108921978, -88.34347057214507),
                new Point(62.65706795898197, 82.72819943457128),
                new Point(82.84341967288361, -66.51267061415744),
                new Point(78.90455575569476, 11.424261461072916),
                new Point(-1.4110673039956936, 13.963242833131858),
                new Point(-73.53811399346912, -73.54262594367327),
                new Point(-65.52019431186409, 29.432989996146915),
                new Point(-60.84312345962979, -93.80079622759656),
                new Point(-94.0672093263702, 10.119227843365294),
                new Point(-59.31580947374553, -90.9457041067532),
                new Point(-15.005671191488773, 29.48205497539709),
                new Point(-99.71971154605079, 99.63304813128832),
                new Point(28.176739923289688, -71.05325323005309),
                new Point(40.05962166000427, 59.314656853338136),
                new Point(11.333103933656048, 41.68913304773173),
                new Point(96.2242528162499, -15.489659400392199),
                new Point(-65.81558933712623, -38.43956548614964),
                new Point(-49.394564218260406, 79.31584295412114),
                new Point(14.190145692323014, 91.60944102408388),
                new Point(53.74494173600007, -19.3545778873752),
                new Point(-67.405764558875, -0.5337631680972095),
                new Point(-51.78720963648769, -84.00291683527303),
                new Point(-90.27095393679903, -39.17859809175821),
                new Point(-54.96935688597271, 38.986591615401466),
                new Point(5.215549121938295, 51.73913283780013),
                new Point(48.84144225499506, -33.79137438990473),
                new Point(83.27338326930766, -32.877399243637655),
                new Point(55.86407106030481, 4.39154410726654),
                new Point(-96.63390067504758, 95.65815843401484),
                new Point(-55.294165753596644, -10.722194225128305),
                new Point(28.978859410579332, 78.00298128251353),
                new Point(-15.438040982265292, 80.88884296082941),
                new Point(97.43639336415262, -6.791676678404073),
                new Point(35.946282455972295, -34.130179931467225),
                new Point(-79.15863208071352, 17.906204419095076),
                new Point(67.37161653106708, -49.03662824319579),
                new Point(-47.624691160569, 4.483334705350899),
                new Point(-6.0795636230403005, -4.736071721209825),
                new Point(-67.36615373796567, -5.6362593483831205),
                new Point(-58.934204861381986, -71.19261841420035),
                new Point(-55.833390261894486, -37.624133811214186),
                new Point(24.806766002093156, 9.758596442659865),
                new Point(96.70767837450873, -60.88983027610011),
                new Point(-29.00688871234884, -79.00063830313908),
                new Point(-15.2684966039089, 86.5505772693358),
                new Point(-55.21111260925296, 99.28163728085602),
                new Point(-81.97501637126294, 61.32295586336386),
                new Point(-72.01110810125414, 59.84897908075661),
                new Point(-57.39920057741155, 4.254847315006344),
                new Point(18.406858979619884, 19.202733871200635),
                new Point(56.08923699826573, -93.07950876498343),
                new Point(-73.45469940141425, -36.121908986549876),
                new Point(-35.55978015992336, -64.02109811965778),
                new Point(26.423267673407807, 58.006397748335814),
                new Point(11.449613109772287, -35.06401977726179),
                new Point(73.78447735338577, 74.40932676439365),
                new Point(-9.344373175232718, -99.83907410773585),
                new Point(-58.00822290396732, 82.87416431604308),
                new Point(0.7505229824523099, -28.1222223203296),
                new Point(-97.4374673769919, -3.2702509179958383),
                new Point(-35.970438483683026, -97.51108153229755),
                new Point(16.742769895269973, -81.01389565121943),
                new Point(-80.72516658562994, -27.849134242573186),
                new Point(84.43400945369831, 82.52322094538457),
                new Point(95.08060575257628, 53.830644050586955),
                new Point(-37.12153662596847, -78.07004569488683),
                new Point(28.516039260191803, -26.019662444657072),
                new Point(-48.102218842234976, 29.914239922222464),
                new Point(-12.067227607698456, 64.7043722984759),
                new Point(9.311545195169458, 44.73895870813095),
                new Point(52.07940008206887, -54.1018306284855),
                new Point(-56.02267180837765, 93.58740833101703),
        };
        Main.LCM = new int[][]
                {
                        {NOTUSED, OR, NOTUSED, NOTUSED, OR, OR, OR, NOTUSED, OR, OR, OR, AND, OR, NOTUSED, OR, },
                        {OR, OR, AND, AND, NOTUSED, AND, OR, NOTUSED, OR, AND, NOTUSED, NOTUSED, OR, OR, AND, },
                        {NOTUSED, AND, AND, NOTUSED, NOTUSED, AND, AND, OR, AND, OR, OR, NOTUSED, AND, NOTUSED, NOTUSED, },
                        {NOTUSED, AND, NOTUSED, OR, NOTUSED, NOTUSED, AND, NOTUSED, OR, NOTUSED, OR, AND, AND, OR, NOTUSED, },
                        {OR, NOTUSED, NOTUSED, NOTUSED, OR, AND, AND, NOTUSED, OR, NOTUSED, OR, NOTUSED, AND, NOTUSED, AND, },
                        {OR, AND, AND, NOTUSED, AND, AND, AND, AND, OR, OR, OR, OR, AND, AND, OR, },
                        {OR, OR, AND, AND, AND, AND, OR, AND, AND, NOTUSED, AND, AND, OR, OR, AND, },
                        {NOTUSED, NOTUSED, OR, NOTUSED, NOTUSED, AND, AND, AND, AND, AND, AND, OR, AND, AND, AND, },
                        {OR, OR, AND, OR, OR, OR, AND, AND, OR, OR, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, },
                        {OR, AND, OR, NOTUSED, NOTUSED, OR, NOTUSED, AND, OR, OR, NOTUSED, NOTUSED, AND, NOTUSED, AND, },
                        {OR, NOTUSED, OR, OR, OR, OR, AND, AND, NOTUSED, NOTUSED, AND, OR, OR, OR, NOTUSED, },
                        {AND, NOTUSED, NOTUSED, AND, NOTUSED, OR, AND, OR, NOTUSED, NOTUSED, OR, OR, NOTUSED, NOTUSED, OR, },
                        {OR, OR, AND, AND, AND, AND, OR, AND, NOTUSED, AND, OR, NOTUSED, AND, NOTUSED, OR, },
                        {NOTUSED, OR, NOTUSED, OR, NOTUSED, AND, OR, AND, NOTUSED, NOTUSED, OR, NOTUSED, NOTUSED, AND, NOTUSED, },
                        {OR, AND, NOTUSED, NOTUSED, AND, OR, AND, AND, NOTUSED, AND, NOTUSED, OR, OR, NOTUSED, NOTUSED, },



                };


        assertTrue(Main.decide());



    }

}