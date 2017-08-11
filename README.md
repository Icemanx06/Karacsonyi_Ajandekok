	
Karácsonyi ajándékok (Java)
A karácsony a szeretet ünnepe. Ilyenkor a családtagok körülülik a karácsonyfát, és együtt bontogatják az ajándékokkal teli csomagokat. 
Az ön feladata, hogy írjon egy programot, amely kimutatást készít az idei karácsonyról a standard bemenetről olvasott adatok alapján!
A standard bemenet egy-egy sora azt írja le, hogy egy-egy családtag kinek milyen ajándékokat rakott a karácsonyfa alá:
családtag_neve:ajándék–>családtag_neve[;ajándék–>családtag_neve]…
Sem a családtagok nevei, sem az ajándékok megnevezései nem tartalmaznak kettőspont vagy pontosvessző karaktert,
és nem tartalmazzák a -> többkarakteres szimbólumot sem, ezek a családtagok neveinek és az ajándékoknak az elválasztására szolgálnak.
A program írja a standard kimenetre a példa kimenetben látható módon annak a családtagnak a nevét és a neki ajándékozott meglepetéseket, 
aki a legtöbb ajándékot kapta! Ha több olyan családtag is lenne, akik egyformán sok ajándékot kaptak,
akkor őket lexikografikusan növekvő sorrendben írja a kimenetre! Az ajándékok minden esetben lexikografikusan növekvő sorrendben kerüljenek
kiírásra a megajándékozott nevével egy sorban, tőle egy kettőspont és egy szóköz karakterrel, 
egymástól pedig egy vessző és egy szóköz karakterrel elválasztva! Ügyeljen rá, hogy a sorok végén ne álljon semmilyen felesleges karakter
(se szóköz, se vessző, se ezek kombinációja)!

Példa bemenet:
Peter:villanyvasut->Janos;tarsasjatek->Dora;borotva->Gabor;parfum->Vivien
Janos:zokni->Gabor;koromlakk-eltavolito folyadek->Dora
Vivien:papucs->Peter;egyujjas kiforditott bundakesztyu->Janos;tablet->Gabor
Gabor:hintaszek->Janos;babahaz->Dora

A példa bemenethez tartozó kimenet:
Dora: babahaz, koromlakk-eltavolito folyadek, tarsasjatek
Gabor: borotva, tablet, zokni
Janos: egyujjas kiforditott bundakesztyu, hintaszek, villanyvasut
