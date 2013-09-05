HostAndPort hap1 = HostAndPort.fromString("localhost:80");

assertThat(hap1.getHostText(), is("localhost"));
assertThat(hap1.getPort(), is(80));

HostAndPort hap2 = HostAndPort.fromString("[2001:db8::1]");

assertThat(hap2.getHostText(), is("2001:db8::1"));
assertThat(hap2.getPortOrDefault(8080), is(8080));