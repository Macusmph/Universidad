library IEEE;
    use IEEE.STD_LOGIC_1164.all; --Comentarios

--entidad se debe llamar igual que el archivo

entity myFirstProject is
    port(
        a, b, c: in std_logic;
        d: out std_logic
    );
end myFirstProject;

architecture BeH of myFirstProject is

    -- Signals, constants, components, signal types

    begin

        --behavioral

        d <= (a and b) or (b and c) or (b and c);

    end BeH;