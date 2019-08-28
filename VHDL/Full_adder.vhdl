library IEEE;
    use IEEE.STD_LOGIC_1164.all;

entity Full_adder is
    port(
        fa, fb, fc: in std_logic;
        cout, fs: out std_logic
    );
end Full_adder;

architecture BeH of Full_adder is

    signal hsignal: std_logic;
    signal cout1: std_logic;
    signal cout2: std_logic;

    component Half_adder is
        port(
            a, b: in std_logic;
            sum, carry: out std_logic
        );
    end component;

    begin

        U0: Half_adder port map(fa, fb, hsignal, cout1);
        U1: Half_adder port map(hsignal, fc, fs, cout2);

        cout <= (cout1 or cout2);

    end BeH;