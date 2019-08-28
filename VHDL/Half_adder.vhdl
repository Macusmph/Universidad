library IEEE;
    use IEEE.STD_LOGIC_1164.all;

entity Half_adder is
    port(
        a, b: in std_logic;
        sum, carry: out std_logic
    );
end Half_adder;

architecture BeH of Half_adder is
        sum <= a xor b;
        carry <= a and b;
    end BeH;