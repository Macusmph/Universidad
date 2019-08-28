library IEEE;
    use IEEE.STD_LOGIC_1164.all; --Comentarios

--entidad se debe llamar igual que el archivo

entity myAnd is
    port(
        a, b: in std_logic;
        c: out std_logic
    );
end myAnd;

architecture BeH of myAnd is

    -- Signals, constants, components, signal types

    begin

        --behavioral

        c <= a and b;

    end BeH;