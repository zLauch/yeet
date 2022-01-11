__config() -> {
    'stay_loaded' -> true,
    'commands' -> {
        '<players>' -> _(plrA) -> _yeet(plrA);
    }
};

__yeet() -> (
    plr = player(plrA:0);
    run('tp '+plr+' '+plr(query(x))+' 69420 '+plr(query(z))+'');
);