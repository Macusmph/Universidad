library IEEE;
    use IEEE.STD_LOGIC_1164.all; --Comentarios

--entidad se debe llamar igual que el archivo

entity myOr is
    port(
        a, b: in std_logic;
        c: out std_logic
    );
end myOr;

architecture BeH of myOr is

    -- Signals, constants, components, signal types

    begin

        --behavioral

        c <= a or b;

    end BeH;