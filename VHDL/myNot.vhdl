library IEEE;
    use IEEE.STD_LOGIC_1164.all; --Comentarios

--entidad se debe llamar igual que el archivo

entity myNot is
    port(
        a: in std_logic;
        b: out std_logic
    );
end myNot;

architecture BeH of myNot is

    -- Signals, constants, components, signal types

    begin

        --behavioral

        b <= not a;

    end BeH;