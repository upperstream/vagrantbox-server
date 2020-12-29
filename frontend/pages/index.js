import Head from 'next/head'

export default function Home({data}) {
  return (
    <>
      <Head>
        <title>VagrantBox Server</title>
      </Head>

      <main>
        <div>
          <h1>VagrantBox Server</h1>
        </div>
      </main>

      <footer>
        <div>
          <p>Server backend version: { data.version }<br />
          Server frontend version: { process.env.npm_package_version }</p>
        </div>
      </footer>
    </>
  )
}

export async function getServerSideProps(context) {
  const res = await fetch('http://localhost:8080/version')
  const data = await res.json()
  return { props: { data } }
}
