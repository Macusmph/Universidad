library IEEE;
    use IEEE.STD_LOGIC_1164.all; --Comentarios

--entidad se debe llamar igual que el archivo

entity structuralComponent is
    port(
        door, ignition, sbelt: in std_logic;
        warning: out std_logic
    );
end structuralComponent;

architecture BeH of structuralComponent is

    -- Signals, constants, components, signal types

    signal door_not: std_logic := '0'; --inicializar señal con := Solo sirve para la simulación
    signal sbelt_not: std_logic;
    signal s1_and: std_logic;
    signal s2_and: std_logic;

    component myAnd is
        port(
            a, b: in std_logic;
            c: out std_logic
        );
    end component;

    component myOr is
        port(
            a, b: in std_logic;
            c: out std_logic
        );
    end component;
    
    component myNot is
        port(
            a: in std_logic;
            b: out std_logic
        );
    end component;

    begin

        --declarar instancia
        U0: myNot port map(door, door_not);
        U1: myNot port map(sbelt, sbelt_not);

        U2: myAnd port map(door_not, ignition, s1_and);
        U3: myAnd port map(sbelt_not, ignition, s2_and);

        U4: myOr port map(s1_and, s2_and, warning)
        
        --PROPAGATION DELAY
        --  todas se ejecutan al mismo tiempo, pero primero se 
        --  ejecutarán las not, luego las and y luego el or por la señal
    end BeH;